package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Especie;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class EspecieController {
	@Autowired
	private Facade facade;
	
	@GetMapping("especie")
	public List<EspecieResponse> getAllEspecie() {
		return facade.getAllEspecie()
			.stream()
			.map(EspecieResponse::new)
			.toList();
	}
	
	@PostMapping("especie")
	public EspecieResponse createEspecie(@Valid @RequestBody EspecieRequest newObj) {
		return new EspecieResponse(facade.saveEspecie(newObj.toEspecie()));
	}
	
	@GetMapping("especie/{id}")
	public EspecieResponse getEspecieById(@PathVariable Long id) {
		try {
			return new EspecieResponse(facade.findEspecieById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Especie " + id + " not found.");
		}
	}
	
	@PostMapping("especie/{id}")
	public EspecieResponse updateEspecie(@PathVariable Long id, @Valid @RequestBody EspecieRequest obj) {
		try {
			Especie o = obj.toEspecie();
			o.setId(id);
			return new EspecieResponse(facade.updateEspecie(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Especie " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("especie/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteEspecie(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Especie " + id + " not found.");
		}
		
	}
	

}
