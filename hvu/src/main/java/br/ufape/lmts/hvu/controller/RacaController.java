package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Raca;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class RacaController {
	@Autowired
	private Facade facade;
	
	@GetMapping("raca")
	public List<RacaResponse> getAllRaca() {
		return facade.getAllRaca()
			.stream()
			.map(RacaResponse::new)
			.toList();
	}
	
	@PostMapping("raca")
	public RacaResponse createRaca(@Valid @RequestBody RacaRequest newObj) {
		return new RacaResponse(facade.saveRaca(newObj.toRaca()));
	}
	
	@GetMapping("raca/{id}")
	public RacaResponse getRacaById(@PathVariable Long id) {
		try {
			return new RacaResponse(facade.findRacaById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Raca " + id + " not found.");
		}
	}
	
	@PostMapping("raca/{id}")
	public RacaResponse updateRaca(@PathVariable Long id, @Valid @RequestBody RacaRequest obj) {
		try {
			Raca o = obj.toRaca();
			o.setId(id);
			return new RacaResponse(facade.updateRaca(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Raca " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("raca/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteRaca(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Raca " + id + " not found.");
		}
		
	}
	

}
