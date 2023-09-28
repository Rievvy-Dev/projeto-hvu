package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.ExameComplementarRepository;
import br.ufape.lmts.hvu.model.ExameComplementar;

@Service
public class ExameComplementarService implements ExameComplementarServiceInterface {
	@Autowired
	ExameComplementarRepository repository;

	public ExameComplementarService(ExameComplementarRepository repository) {
		this.repository = repository;
	}

	public ExameComplementarService() {
	}
	
	public ExameComplementarRepository getRepository() {
		return repository;
	}

	public void setDao(ExameComplementarRepository repository) {
		this.repository = repository;
	}	

	public ExameComplementar saveExameComplementar(ExameComplementar newInstance) {
		return repository.save(newInstance);
	}

	public ExameComplementar updateExameComplementar(ExameComplementar transientObject) {
		return repository.save(transientObject);
	}

	public ExameComplementar findExameComplementarById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist ExameComplementar with id = " + id));
	}

	public List<ExameComplementar> getAllExameComplementar(){
		return repository.findAll();
	}

	public void deleteExameComplementar(ExameComplementar persistentObject){
		this.deleteExameComplementar(persistentObject.getId());
		
	}
	
	public void deleteExameComplementar(long id){
		ExameComplementar obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist ExameComplementar with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}