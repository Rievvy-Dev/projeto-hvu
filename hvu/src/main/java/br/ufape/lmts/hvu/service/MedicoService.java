package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.MedicoRepository;
import br.ufape.lmts.hvu.model.Medico;

@Service
public class MedicoService implements MedicoServiceInterface {
	@Autowired
	MedicoRepository repository;

	public MedicoService(MedicoRepository repository) {
		this.repository = repository;
	}

	public MedicoService() {
	}
	
	public MedicoRepository getRepository() {
		return repository;
	}

	public void setDao(MedicoRepository repository) {
		this.repository = repository;
	}	

	public Medico saveMedico(Medico newInstance) {
		return repository.save(newInstance);
	}

	public Medico updateMedico(Medico transientObject) {
		return repository.save(transientObject);
	}

	public Medico findMedicoById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Medico with id = " + id));
	}

	public List<Medico> getAllMedico(){
		return repository.findAll();
	}

	public void deleteMedico(Medico persistentObject){
		this.deleteMedico(persistentObject.getId());
		
	}
	
	public void deleteMedico(long id){
		Medico obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Medico with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}