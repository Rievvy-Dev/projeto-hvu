package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.PrescricaoRepository;
import br.ufape.lmts.hvu.model.Prescricao;

@Service
public class PrescricaoService implements PrescricaoServiceInterface {
	@Autowired
	PrescricaoRepository repository;

	public PrescricaoService(PrescricaoRepository repository) {
		this.repository = repository;
	}

	public PrescricaoService() {
	}
	
	public PrescricaoRepository getRepository() {
		return repository;
	}

	public void setDao(PrescricaoRepository repository) {
		this.repository = repository;
	}	

	public Prescricao savePrescricao(Prescricao newInstance) {
		return repository.save(newInstance);
	}

	public Prescricao updatePrescricao(Prescricao transientObject) {
		return repository.save(transientObject);
	}

	public Prescricao findPrescricaoById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Prescricao with id = " + id));
	}

	public List<Prescricao> getAllPrescricao(){
		return repository.findAll();
	}

	public void deletePrescricao(Prescricao persistentObject){
		this.deletePrescricao(persistentObject.getId());
		
	}
	
	public void deletePrescricao(long id){
		Prescricao obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Prescricao with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}