package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Estagiario;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class EstagiarioController {
	@Autowired
	private Facade facade;
	
	@GetMapping("estagiario")
	public List<EstagiarioResponse> getAllEstagiario() {
		return facade.getAllEstagiario()
			.stream()
			.map(EstagiarioResponse::new)
			.toList();
	}
	
	@PostMapping("estagiario")
	public EstagiarioResponse createEstagiario(@Valid @RequestBody EstagiarioRequest newObj) {
		return new EstagiarioResponse(facade.saveEstagiario(newObj.toEstagiario()));
	}
	
	@GetMapping("estagiario/{id}")
	public EstagiarioResponse getEstagiarioById(@PathVariable Long id) {
		try {
			return new EstagiarioResponse(facade.findEstagiarioById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Estagiario " + id + " not found.");
		}
	}
	
	@PostMapping("estagiario/{id}")
	public EstagiarioResponse updateEstagiario(@PathVariable Long id, @Valid @RequestBody EstagiarioRequest obj) {
		try {
			Estagiario o = obj.toEstagiario();
			o.setId(id);
			return new EstagiarioResponse(facade.updateEstagiario(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Estagiario " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("estagiario/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteEstagiario(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Estagiario " + id + " not found.");
		}
		
	}
	

}
