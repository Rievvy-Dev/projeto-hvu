package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Parecer;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class ParecerController {
	@Autowired
	private Facade facade;
	
	@GetMapping("parecer")
	public List<ParecerResponse> getAllParecer() {
		return facade.getAllParecer()
			.stream()
			.map(ParecerResponse::new)
			.toList();
	}
	
	@PostMapping("parecer")
	public ParecerResponse createParecer(@Valid @RequestBody ParecerRequest newObj) {
		return new ParecerResponse(facade.saveParecer(newObj.toParecer()));
	}
	
	@GetMapping("parecer/{id}")
	public ParecerResponse getParecerById(@PathVariable Long id) {
		try {
			return new ParecerResponse(facade.findParecerById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Parecer " + id + " not found.");
		}
	}
	
	@PostMapping("parecer/{id}")
	public ParecerResponse updateParecer(@PathVariable Long id, @Valid @RequestBody ParecerRequest obj) {
		try {
			Parecer o = obj.toParecer();
			o.setId(id);
			return new ParecerResponse(facade.updateParecer(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Parecer " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("parecer/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteParecer(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Parecer " + id + " not found.");
		}
		
	}
	

}
