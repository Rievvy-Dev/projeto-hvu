package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.Animal;

public interface AnimalServiceInterface {
	Animal saveAnimal(Animal o);
	Animal findAnimalById(long id);
	Animal updateAnimal(Animal u);
	void deleteAnimal(Animal u);
	void deleteAnimal(long id);
	List<Animal> getAllAnimal();
    
    

    
}