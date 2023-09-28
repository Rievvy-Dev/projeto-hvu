package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Secretario;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class SecretarioController {
	@Autowired
	private Facade facade;
	
	@GetMapping("secretario")
	public List<SecretarioResponse> getAllSecretario() {
		return facade.getAllSecretario()
			.stream()
			.map(SecretarioResponse::new)
			.toList();
	}
	
	@PostMapping("secretario")
	public SecretarioResponse createSecretario(@Valid @RequestBody SecretarioRequest newObj) {
		return new SecretarioResponse(facade.saveSecretario(newObj.toSecretario()));
	}
	
	@GetMapping("secretario/{id}")
	public SecretarioResponse getSecretarioById(@PathVariable Long id) {
		try {
			return new SecretarioResponse(facade.findSecretarioById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Secretario " + id + " not found.");
		}
	}
	
	@PostMapping("secretario/{id}")
	public SecretarioResponse updateSecretario(@PathVariable Long id, @Valid @RequestBody SecretarioRequest obj) {
		try {
			Secretario o = obj.toSecretario();
			o.setId(id);
			return new SecretarioResponse(facade.updateSecretario(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Secretario " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("secretario/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteSecretario(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Secretario " + id + " not found.");
		}
		
	}
	

}
