package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.TipoExame;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class TipoExameController {
	@Autowired
	private Facade facade;
	
	@GetMapping("tipoExame")
	public List<TipoExameResponse> getAllTipoExame() {
		return facade.getAllTipoExame()
			.stream()
			.map(TipoExameResponse::new)
			.toList();
	}
	
	@PostMapping("tipoExame")
	public TipoExameResponse createTipoExame(@Valid @RequestBody TipoExameRequest newObj) {
		return new TipoExameResponse(facade.saveTipoExame(newObj.toTipoExame()));
	}
	
	@GetMapping("tipoExame/{id}")
	public TipoExameResponse getTipoExameById(@PathVariable Long id) {
		try {
			return new TipoExameResponse(facade.findTipoExameById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TipoExame " + id + " not found.");
		}
	}
	
	@PostMapping("tipoExame/{id}")
	public TipoExameResponse updateTipoExame(@PathVariable Long id, @Valid @RequestBody TipoExameRequest obj) {
		try {
			TipoExame o = obj.toTipoExame();
			o.setId(id);
			return new TipoExameResponse(facade.updateTipoExame(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TipoExame " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("tipoExame/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteTipoExame(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TipoExame " + id + " not found.");
		}
		
	}
	

}
