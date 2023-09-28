package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Diretor;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class DiretorController {
	@Autowired
	private Facade facade;
	
	@GetMapping("diretor")
	public List<DiretorResponse> getAllDiretor() {
		return facade.getAllDiretor()
			.stream()
			.map(DiretorResponse::new)
			.toList();
	}
	
	@PostMapping("diretor")
	public DiretorResponse createDiretor(@Valid @RequestBody DiretorRequest newObj) {
		return new DiretorResponse(facade.saveDiretor(newObj.toDiretor()));
	}
	
	@GetMapping("diretor/{id}")
	public DiretorResponse getDiretorById(@PathVariable Long id) {
		try {
			return new DiretorResponse(facade.findDiretorById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Diretor " + id + " not found.");
		}
	}
	
	@PostMapping("diretor/{id}")
	public DiretorResponse updateDiretor(@PathVariable Long id, @Valid @RequestBody DiretorRequest obj) {
		try {
			Diretor o = obj.toDiretor();
			o.setId(id);
			return new DiretorResponse(facade.updateDiretor(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Diretor " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("diretor/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteDiretor(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Diretor " + id + " not found.");
		}
		
	}
	

}
