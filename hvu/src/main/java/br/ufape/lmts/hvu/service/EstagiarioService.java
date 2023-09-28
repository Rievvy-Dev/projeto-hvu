package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.EstagiarioRepository;
import br.ufape.lmts.hvu.model.Estagiario;

@Service
public class EstagiarioService implements EstagiarioServiceInterface {
	@Autowired
	EstagiarioRepository repository;

	public EstagiarioService(EstagiarioRepository repository) {
		this.repository = repository;
	}

	public EstagiarioService() {
	}
	
	public EstagiarioRepository getRepository() {
		return repository;
	}

	public void setDao(EstagiarioRepository repository) {
		this.repository = repository;
	}	

	public Estagiario saveEstagiario(Estagiario newInstance) {
		return repository.save(newInstance);
	}

	public Estagiario updateEstagiario(Estagiario transientObject) {
		return repository.save(transientObject);
	}

	public Estagiario findEstagiarioById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Estagiario with id = " + id));
	}

	public List<Estagiario> getAllEstagiario(){
		return repository.findAll();
	}

	public void deleteEstagiario(Estagiario persistentObject){
		this.deleteEstagiario(persistentObject.getId());
		
	}
	
	public void deleteEstagiario(long id){
		Estagiario obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Estagiario with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}