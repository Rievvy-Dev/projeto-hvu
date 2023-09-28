package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.AnimalRepository;
import br.ufape.lmts.hvu.model.Animal;

@Service
public class AnimalService implements AnimalServiceInterface {
	@Autowired
	AnimalRepository repository;

	public AnimalService(AnimalRepository repository) {
		this.repository = repository;
	}

	public AnimalService() {
	}
	
	public AnimalRepository getRepository() {
		return repository;
	}

	public void setDao(AnimalRepository repository) {
		this.repository = repository;
	}	

	public Animal saveAnimal(Animal newInstance) {
		return repository.save(newInstance);
	}

	public Animal updateAnimal(Animal transientObject) {
		return repository.save(transientObject);
	}

	public Animal findAnimalById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Animal with id = " + id));
	}

	public List<Animal> getAllAnimal(){
		return repository.findAll();
	}

	public void deleteAnimal(Animal persistentObject){
		this.deleteAnimal(persistentObject.getId());
		
	}
	
	public void deleteAnimal(long id){
		Animal obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Animal with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}