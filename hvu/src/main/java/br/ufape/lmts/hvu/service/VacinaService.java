package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.VacinaRepository;
import br.ufape.lmts.hvu.model.Vacina;

@Service
public class VacinaService implements VacinaServiceInterface {
	@Autowired
	VacinaRepository repository;

	public VacinaService(VacinaRepository repository) {
		this.repository = repository;
	}

	public VacinaService() {
	}
	
	public VacinaRepository getRepository() {
		return repository;
	}

	public void setDao(VacinaRepository repository) {
		this.repository = repository;
	}	

	public Vacina saveVacina(Vacina newInstance) {
		return repository.save(newInstance);
	}

	public Vacina updateVacina(Vacina transientObject) {
		return repository.save(transientObject);
	}

	public Vacina findVacinaById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Vacina with id = " + id));
	}

	public List<Vacina> getAllVacina(){
		return repository.findAll();
	}

	public void deleteVacina(Vacina persistentObject){
		this.deleteVacina(persistentObject.getId());
		
	}
	
	public void deleteVacina(long id){
		Vacina obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Vacina with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}