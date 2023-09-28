package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Animal;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class AnimalController {
	@Autowired
	private Facade facade;
	
	@GetMapping("animal")
	public List<AnimalResponse> getAllAnimal() {
		return facade.getAllAnimal()
			.stream()
			.map(AnimalResponse::new)
			.toList();
	}
	
	@PostMapping("animal")
	public AnimalResponse createAnimal(@Valid @RequestBody AnimalRequest newObj) {
		return new AnimalResponse(facade.saveAnimal(newObj.toAnimal()));
	}
	
	@GetMapping("animal/{id}")
	public AnimalResponse getAnimalById(@PathVariable Long id) {
		try {
			return new AnimalResponse(facade.findAnimalById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Animal " + id + " not found.");
		}
	}
	
	@PostMapping("animal/{id}")
	public AnimalResponse updateAnimal(@PathVariable Long id, @Valid @RequestBody AnimalRequest obj) {
		try {
			Animal o = obj.toAnimal();
			o.setId(id);
			return new AnimalResponse(facade.updateAnimal(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Animal " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("animal/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteAnimal(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Animal " + id + " not found.");
		}
		
	}
	

}
