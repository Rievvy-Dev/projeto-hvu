package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.DiretorRepository;
import br.ufape.lmts.hvu.model.Diretor;

@Service
public class DiretorService implements DiretorServiceInterface {
	@Autowired
	DiretorRepository repository;

	public DiretorService(DiretorRepository repository) {
		this.repository = repository;
	}

	public DiretorService() {
	}
	
	public DiretorRepository getRepository() {
		return repository;
	}

	public void setDao(DiretorRepository repository) {
		this.repository = repository;
	}	

	public Diretor saveDiretor(Diretor newInstance) {
		return repository.save(newInstance);
	}

	public Diretor updateDiretor(Diretor transientObject) {
		return repository.save(transientObject);
	}

	public Diretor findDiretorById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Diretor with id = " + id));
	}

	public List<Diretor> getAllDiretor(){
		return repository.findAll();
	}

	public void deleteDiretor(Diretor persistentObject){
		this.deleteDiretor(persistentObject.getId());
		
	}
	
	public void deleteDiretor(long id){
		Diretor obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Diretor with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}