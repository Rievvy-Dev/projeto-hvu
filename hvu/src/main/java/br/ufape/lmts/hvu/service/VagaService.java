package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.VagaRepository;
import br.ufape.lmts.hvu.model.Vaga;

@Service
public class VagaService implements VagaServiceInterface {
	@Autowired
	VagaRepository repository;

	public VagaService(VagaRepository repository) {
		this.repository = repository;
	}

	public VagaService() {
	}
	
	public VagaRepository getRepository() {
		return repository;
	}

	public void setDao(VagaRepository repository) {
		this.repository = repository;
	}	

	public Vaga saveVaga(Vaga newInstance) {
		return repository.save(newInstance);
	}

	public Vaga updateVaga(Vaga transientObject) {
		return repository.save(transientObject);
	}

	public Vaga findVagaById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Vaga with id = " + id));
	}

	public List<Vaga> getAllVaga(){
		return repository.findAll();
	}

	public void deleteVaga(Vaga persistentObject){
		this.deleteVaga(persistentObject.getId());
		
	}
	
	public void deleteVaga(long id){
		Vaga obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Vaga with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}