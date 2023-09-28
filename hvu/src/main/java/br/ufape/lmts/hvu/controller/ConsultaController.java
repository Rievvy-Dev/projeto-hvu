package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Consulta;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class ConsultaController {
	@Autowired
	private Facade facade;
	
	@GetMapping("consulta")
	public List<ConsultaResponse> getAllConsulta() {
		return facade.getAllConsulta()
			.stream()
			.map(ConsultaResponse::new)
			.toList();
	}
	
	@PostMapping("consulta")
	public ConsultaResponse createConsulta(@Valid @RequestBody ConsultaRequest newObj) {
		return new ConsultaResponse(facade.saveConsulta(newObj.toConsulta()));
	}
	
	@GetMapping("consulta/{id}")
	public ConsultaResponse getConsultaById(@PathVariable Long id) {
		try {
			return new ConsultaResponse(facade.findConsultaById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Consulta " + id + " not found.");
		}
	}
	
	@PostMapping("consulta/{id}")
	public ConsultaResponse updateConsulta(@PathVariable Long id, @Valid @RequestBody ConsultaRequest obj) {
		try {
			Consulta o = obj.toConsulta();
			o.setId(id);
			return new ConsultaResponse(facade.updateConsulta(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Consulta " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("consulta/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteConsulta(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Consulta " + id + " not found.");
		}
		
	}
	

}
