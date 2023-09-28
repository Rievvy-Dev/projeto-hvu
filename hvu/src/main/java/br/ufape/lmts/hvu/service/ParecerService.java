package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.ParecerRepository;
import br.ufape.lmts.hvu.model.Parecer;

@Service
public class ParecerService implements ParecerServiceInterface {
	@Autowired
	ParecerRepository repository;

	public ParecerService(ParecerRepository repository) {
		this.repository = repository;
	}

	public ParecerService() {
	}
	
	public ParecerRepository getRepository() {
		return repository;
	}

	public void setDao(ParecerRepository repository) {
		this.repository = repository;
	}	

	public Parecer saveParecer(Parecer newInstance) {
		return repository.save(newInstance);
	}

	public Parecer updateParecer(Parecer transientObject) {
		return repository.save(transientObject);
	}

	public Parecer findParecerById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Parecer with id = " + id));
	}

	public List<Parecer> getAllParecer(){
		return repository.findAll();
	}

	public void deleteParecer(Parecer persistentObject){
		this.deleteParecer(persistentObject.getId());
		
	}
	
	public void deleteParecer(long id){
		Parecer obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Parecer with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}