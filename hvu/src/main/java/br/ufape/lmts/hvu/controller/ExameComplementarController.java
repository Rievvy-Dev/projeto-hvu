package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.ExameComplementar;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class ExameComplementarController {
	@Autowired
	private Facade facade;
	
	@GetMapping("exameComplementar")
	public List<ExameComplementarResponse> getAllExameComplementar() {
		return facade.getAllExameComplementar()
			.stream()
			.map(ExameComplementarResponse::new)
			.toList();
	}
	
	@PostMapping("exameComplementar")
	public ExameComplementarResponse createExameComplementar(@Valid @RequestBody ExameComplementarRequest newObj) {
		return new ExameComplementarResponse(facade.saveExameComplementar(newObj.toExameComplementar()));
	}
	
	@GetMapping("exameComplementar/{id}")
	public ExameComplementarResponse getExameComplementarById(@PathVariable Long id) {
		try {
			return new ExameComplementarResponse(facade.findExameComplementarById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ExameComplementar " + id + " not found.");
		}
	}
	
	@PostMapping("exameComplementar/{id}")
	public ExameComplementarResponse updateExameComplementar(@PathVariable Long id, @Valid @RequestBody ExameComplementarRequest obj) {
		try {
			ExameComplementar o = obj.toExameComplementar();
			o.setId(id);
			return new ExameComplementarResponse(facade.updateExameComplementar(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ExameComplementar " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("exameComplementar/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteExameComplementar(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ExameComplementar " + id + " not found.");
		}
		
	}
	

}
