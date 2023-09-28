package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.SecretarioRepository;
import br.ufape.lmts.hvu.model.Secretario;

@Service
public class SecretarioService implements SecretarioServiceInterface {
	@Autowired
	SecretarioRepository repository;

	public SecretarioService(SecretarioRepository repository) {
		this.repository = repository;
	}

	public SecretarioService() {
	}
	
	public SecretarioRepository getRepository() {
		return repository;
	}

	public void setDao(SecretarioRepository repository) {
		this.repository = repository;
	}	

	public Secretario saveSecretario(Secretario newInstance) {
		return repository.save(newInstance);
	}

	public Secretario updateSecretario(Secretario transientObject) {
		return repository.save(transientObject);
	}

	public Secretario findSecretarioById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Secretario with id = " + id));
	}

	public List<Secretario> getAllSecretario(){
		return repository.findAll();
	}

	public void deleteSecretario(Secretario persistentObject){
		this.deleteSecretario(persistentObject.getId());
		
	}
	
	public void deleteSecretario(long id){
		Secretario obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Secretario with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}