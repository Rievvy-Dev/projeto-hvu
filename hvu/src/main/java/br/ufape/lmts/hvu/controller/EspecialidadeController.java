package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Especialidade;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class EspecialidadeController {
	@Autowired
	private Facade facade;
	
	@GetMapping("especialidade")
	public List<EspecialidadeResponse> getAllEspecialidade() {
		return facade.getAllEspecialidade()
			.stream()
			.map(EspecialidadeResponse::new)
			.toList();
	}
	
	@PostMapping("especialidade")
	public EspecialidadeResponse createEspecialidade(@Valid @RequestBody EspecialidadeRequest newObj) {
		return new EspecialidadeResponse(facade.saveEspecialidade(newObj.toEspecialidade()));
	}
	
	@GetMapping("especialidade/{id}")
	public EspecialidadeResponse getEspecialidadeById(@PathVariable Long id) {
		try {
			return new EspecialidadeResponse(facade.findEspecialidadeById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Especialidade " + id + " not found.");
		}
	}
	
	@PostMapping("especialidade/{id}")
	public EspecialidadeResponse updateEspecialidade(@PathVariable Long id, @Valid @RequestBody EspecialidadeRequest obj) {
		try {
			Especialidade o = obj.toEspecialidade();
			o.setId(id);
			return new EspecialidadeResponse(facade.updateEspecialidade(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Especialidade " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("especialidade/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteEspecialidade(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Especialidade " + id + " not found.");
		}
		
	}
	

}
