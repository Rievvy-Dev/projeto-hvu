package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Endereco;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class EnderecoController {
	@Autowired
	private Facade facade;
	
	@GetMapping("endereco")
	public List<EnderecoResponse> getAllEndereco() {
		return facade.getAllEndereco()
			.stream()
			.map(EnderecoResponse::new)
			.toList();
	}
	
	@PostMapping("endereco")
	public EnderecoResponse createEndereco(@Valid @RequestBody EnderecoRequest newObj) {
		return new EnderecoResponse(facade.saveEndereco(newObj.toEndereco()));
	}
	
	@GetMapping("endereco/{id}")
	public EnderecoResponse getEnderecoById(@PathVariable Long id) {
		try {
			return new EnderecoResponse(facade.findEnderecoById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Endereco " + id + " not found.");
		}
	}
	
	@PostMapping("endereco/{id}")
	public EnderecoResponse updateEndereco(@PathVariable Long id, @Valid @RequestBody EnderecoRequest obj) {
		try {
			Endereco o = obj.toEndereco();
			o.setId(id);
			return new EnderecoResponse(facade.updateEndereco(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Endereco " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("endereco/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteEndereco(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Endereco " + id + " not found.");
		}
		
	}
	

}
