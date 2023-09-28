package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Vaga;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class VagaController {
	@Autowired
	private Facade facade;
	
	@GetMapping("vaga")
	public List<VagaResponse> getAllVaga() {
		return facade.getAllVaga()
			.stream()
			.map(VagaResponse::new)
			.toList();
	}
	
	@PostMapping("vaga")
	public VagaResponse createVaga(@Valid @RequestBody VagaRequest newObj) {
		return new VagaResponse(facade.saveVaga(newObj.toVaga()));
	}
	
	@GetMapping("vaga/{id}")
	public VagaResponse getVagaById(@PathVariable Long id) {
		try {
			return new VagaResponse(facade.findVagaById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vaga " + id + " not found.");
		}
	}
	
	@PostMapping("vaga/{id}")
	public VagaResponse updateVaga(@PathVariable Long id, @Valid @RequestBody VagaRequest obj) {
		try {
			Vaga o = obj.toVaga();
			o.setId(id);
			return new VagaResponse(facade.updateVaga(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vaga " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("vaga/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteVaga(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vaga " + id + " not found.");
		}
		
	}
	

}
