package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.TipoExameRepository;
import br.ufape.lmts.hvu.model.TipoExame;

@Service
public class TipoExameService implements TipoExameServiceInterface {
	@Autowired
	TipoExameRepository repository;

	public TipoExameService(TipoExameRepository repository) {
		this.repository = repository;
	}

	public TipoExameService() {
	}
	
	public TipoExameRepository getRepository() {
		return repository;
	}

	public void setDao(TipoExameRepository repository) {
		this.repository = repository;
	}	

	public TipoExame saveTipoExame(TipoExame newInstance) {
		return repository.save(newInstance);
	}

	public TipoExame updateTipoExame(TipoExame transientObject) {
		return repository.save(transientObject);
	}

	public TipoExame findTipoExameById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist TipoExame with id = " + id));
	}

	public List<TipoExame> getAllTipoExame(){
		return repository.findAll();
	}

	public void deleteTipoExame(TipoExame persistentObject){
		this.deleteTipoExame(persistentObject.getId());
		
	}
	
	public void deleteTipoExame(long id){
		TipoExame obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist TipoExame with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}