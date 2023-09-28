package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Medico;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class MedicoController {
	@Autowired
	private Facade facade;
	
	@GetMapping("medico")
	public List<MedicoResponse> getAllMedico() {
		return facade.getAllMedico()
			.stream()
			.map(MedicoResponse::new)
			.toList();
	}
	
	@PostMapping("medico")
	public MedicoResponse createMedico(@Valid @RequestBody MedicoRequest newObj) {
		return new MedicoResponse(facade.saveMedico(newObj.toMedico()));
	}
	
	@GetMapping("medico/{id}")
	public MedicoResponse getMedicoById(@PathVariable Long id) {
		try {
			return new MedicoResponse(facade.findMedicoById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Medico " + id + " not found.");
		}
	}
	
	@PostMapping("medico/{id}")
	public MedicoResponse updateMedico(@PathVariable Long id, @Valid @RequestBody MedicoRequest obj) {
		try {
			Medico o = obj.toMedico();
			o.setId(id);
			return new MedicoResponse(facade.updateMedico(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Medico " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("medico/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteMedico(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Medico " + id + " not found.");
		}
		
	}
	

}
