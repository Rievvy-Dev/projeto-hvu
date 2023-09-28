package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.HistoricoMedicoPregresso;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class HistoricoMedicoPregressoController {
	@Autowired
	private Facade facade;
	
	@GetMapping("historicoMedicoPregresso")
	public List<HistoricoMedicoPregressoResponse> getAllHistoricoMedicoPregresso() {
		return facade.getAllHistoricoMedicoPregresso()
			.stream()
			.map(HistoricoMedicoPregressoResponse::new)
			.toList();
	}
	
	@PostMapping("historicoMedicoPregresso")
	public HistoricoMedicoPregressoResponse createHistoricoMedicoPregresso(@Valid @RequestBody HistoricoMedicoPregressoRequest newObj) {
		return new HistoricoMedicoPregressoResponse(facade.saveHistoricoMedicoPregresso(newObj.toHistoricoMedicoPregresso()));
	}
	
	@GetMapping("historicoMedicoPregresso/{id}")
	public HistoricoMedicoPregressoResponse getHistoricoMedicoPregressoById(@PathVariable Long id) {
		try {
			return new HistoricoMedicoPregressoResponse(facade.findHistoricoMedicoPregressoById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "HistoricoMedicoPregresso " + id + " not found.");
		}
	}
	
	@PostMapping("historicoMedicoPregresso/{id}")
	public HistoricoMedicoPregressoResponse updateHistoricoMedicoPregresso(@PathVariable Long id, @Valid @RequestBody HistoricoMedicoPregressoRequest obj) {
		try {
			HistoricoMedicoPregresso o = obj.toHistoricoMedicoPregresso();
			o.setId(id);
			return new HistoricoMedicoPregressoResponse(facade.updateHistoricoMedicoPregresso(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "HistoricoMedicoPregresso " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("historicoMedicoPregresso/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteHistoricoMedicoPregresso(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "HistoricoMedicoPregresso " + id + " not found.");
		}
		
	}
	

}
