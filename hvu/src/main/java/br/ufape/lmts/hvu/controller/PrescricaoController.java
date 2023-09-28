package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Prescricao;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class PrescricaoController {
	@Autowired
	private Facade facade;
	
	@GetMapping("prescricao")
	public List<PrescricaoResponse> getAllPrescricao() {
		return facade.getAllPrescricao()
			.stream()
			.map(PrescricaoResponse::new)
			.toList();
	}
	
	@PostMapping("prescricao")
	public PrescricaoResponse createPrescricao(@Valid @RequestBody PrescricaoRequest newObj) {
		return new PrescricaoResponse(facade.savePrescricao(newObj.toPrescricao()));
	}
	
	@GetMapping("prescricao/{id}")
	public PrescricaoResponse getPrescricaoById(@PathVariable Long id) {
		try {
			return new PrescricaoResponse(facade.findPrescricaoById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Prescricao " + id + " not found.");
		}
	}
	
	@PostMapping("prescricao/{id}")
	public PrescricaoResponse updatePrescricao(@PathVariable Long id, @Valid @RequestBody PrescricaoRequest obj) {
		try {
			Prescricao o = obj.toPrescricao();
			o.setId(id);
			return new PrescricaoResponse(facade.updatePrescricao(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Prescricao " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("prescricao/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deletePrescricao(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Prescricao " + id + " not found.");
		}
		
	}
	

}
