package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Vacina;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class VacinaController {
	@Autowired
	private Facade facade;
	
	@GetMapping("vacina")
	public List<VacinaResponse> getAllVacina() {
		return facade.getAllVacina()
			.stream()
			.map(VacinaResponse::new)
			.toList();
	}
	
	@PostMapping("vacina")
	public VacinaResponse createVacina(@Valid @RequestBody VacinaRequest newObj) {
		return new VacinaResponse(facade.saveVacina(newObj.toVacina()));
	}
	
	@GetMapping("vacina/{id}")
	public VacinaResponse getVacinaById(@PathVariable Long id) {
		try {
			return new VacinaResponse(facade.findVacinaById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vacina " + id + " not found.");
		}
	}
	
	@PostMapping("vacina/{id}")
	public VacinaResponse updateVacina(@PathVariable Long id, @Valid @RequestBody VacinaRequest obj) {
		try {
			Vacina o = obj.toVacina();
			o.setId(id);
			return new VacinaResponse(facade.updateVacina(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vacina " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("vacina/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteVacina(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vacina " + id + " not found.");
		}
		
	}
	

}
