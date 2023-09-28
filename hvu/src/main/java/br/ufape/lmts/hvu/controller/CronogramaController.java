package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Cronograma;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class CronogramaController {
	@Autowired
	private Facade facade;
	
	@GetMapping("cronograma")
	public List<CronogramaResponse> getAllCronograma() {
		return facade.getAllCronograma()
			.stream()
			.map(CronogramaResponse::new)
			.toList();
	}
	
	@PostMapping("cronograma")
	public CronogramaResponse createCronograma(@Valid @RequestBody CronogramaRequest newObj) {
		return new CronogramaResponse(facade.saveCronograma(newObj.toCronograma()));
	}
	
	@GetMapping("cronograma/{id}")
	public CronogramaResponse getCronogramaById(@PathVariable Long id) {
		try {
			return new CronogramaResponse(facade.findCronogramaById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cronograma " + id + " not found.");
		}
	}
	
	@PostMapping("cronograma/{id}")
	public CronogramaResponse updateCronograma(@PathVariable Long id, @Valid @RequestBody CronogramaRequest obj) {
		try {
			Cronograma o = obj.toCronograma();
			o.setId(id);
			return new CronogramaResponse(facade.updateCronograma(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cronograma " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("cronograma/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteCronograma(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cronograma " + id + " not found.");
		}
		
	}
	

}
