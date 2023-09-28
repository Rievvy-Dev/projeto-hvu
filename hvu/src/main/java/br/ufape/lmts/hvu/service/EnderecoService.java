package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.EnderecoRepository;
import br.ufape.lmts.hvu.model.Endereco;

@Service
public class EnderecoService implements EnderecoServiceInterface {
	@Autowired
	EnderecoRepository repository;

	public EnderecoService(EnderecoRepository repository) {
		this.repository = repository;
	}

	public EnderecoService() {
	}
	
	public EnderecoRepository getRepository() {
		return repository;
	}

	public void setDao(EnderecoRepository repository) {
		this.repository = repository;
	}	

	public Endereco saveEndereco(Endereco newInstance) {
		return repository.save(newInstance);
	}

	public Endereco updateEndereco(Endereco transientObject) {
		return repository.save(transientObject);
	}

	public Endereco findEnderecoById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Endereco with id = " + id));
	}

	public List<Endereco> getAllEndereco(){
		return repository.findAll();
	}

	public void deleteEndereco(Endereco persistentObject){
		this.deleteEndereco(persistentObject.getId());
		
	}
	
	public void deleteEndereco(long id){
		Endereco obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Endereco with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}