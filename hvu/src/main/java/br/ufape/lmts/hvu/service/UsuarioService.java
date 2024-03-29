package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.UsuarioRepository;
import br.ufape.lmts.hvu.model.Usuario;

@Service
public class UsuarioService implements UsuarioServiceInterface {
	@Autowired
	UsuarioRepository repository;

	public UsuarioService(UsuarioRepository repository) {
		this.repository = repository;
	}

	public UsuarioService() {
	}
	
	public UsuarioRepository getRepository() {
		return repository;
	}

	public void setDao(UsuarioRepository repository) {
		this.repository = repository;
	}	

	public Usuario saveUsuario(Usuario newInstance) {
		return repository.save(newInstance);
	}

	public Usuario updateUsuario(Usuario transientObject) {
		return repository.save(transientObject);
	}

	public Usuario findUsuarioById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Usuario with id = " + id));
	}

	public List<Usuario> getAllUsuario(){
		return repository.findAll();
	}

	public void deleteUsuario(Usuario persistentObject){
		this.deleteUsuario(persistentObject.getId());
		
	}
	
	public void deleteUsuario(long id){
		Usuario obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Usuario with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}