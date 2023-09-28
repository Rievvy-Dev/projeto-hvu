package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.TutorRepository;
import br.ufape.lmts.hvu.model.Tutor;

@Service
public class TutorService implements TutorServiceInterface {
	@Autowired
	TutorRepository repository;

	public TutorService(TutorRepository repository) {
		this.repository = repository;
	}

	public TutorService() {
	}
	
	public TutorRepository getRepository() {
		return repository;
	}

	public void setDao(TutorRepository repository) {
		this.repository = repository;
	}	

	public Tutor saveTutor(Tutor newInstance) {
		return repository.save(newInstance);
	}

	public Tutor updateTutor(Tutor transientObject) {
		return repository.save(transientObject);
	}

	public Tutor findTutorById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Tutor with id = " + id));
	}

	public List<Tutor> getAllTutor(){
		return repository.findAll();
	}

	public void deleteTutor(Tutor persistentObject){
		this.deleteTutor(persistentObject.getId());
		
	}
	
	public void deleteTutor(long id){
		Tutor obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Tutor with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}