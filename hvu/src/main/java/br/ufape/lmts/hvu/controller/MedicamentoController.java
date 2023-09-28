package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.Medicamento;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class MedicamentoController {
	@Autowired
	private Facade facade;
	
	@GetMapping("medicamento")
	public List<MedicamentoResponse> getAllMedicamento() {
		return facade.getAllMedicamento()
			.stream()
			.map(MedicamentoResponse::new)
			.toList();
	}
	
	@PostMapping("medicamento")
	public MedicamentoResponse createMedicamento(@Valid @RequestBody MedicamentoRequest newObj) {
		return new MedicamentoResponse(facade.saveMedicamento(newObj.toMedicamento()));
	}
	
	@GetMapping("medicamento/{id}")
	public MedicamentoResponse getMedicamentoById(@PathVariable Long id) {
		try {
			return new MedicamentoResponse(facade.findMedicamentoById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Medicamento " + id + " not found.");
		}
	}
	
	@PostMapping("medicamento/{id}")
	public MedicamentoResponse updateMedicamento(@PathVariable Long id, @Valid @RequestBody MedicamentoRequest obj) {
		try {
			Medicamento o = obj.toMedicamento();
			o.setId(id);
			return new MedicamentoResponse(facade.updateMedicamento(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Medicamento " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("medicamento/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteMedicamento(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Medicamento " + id + " not found.");
		}
		
	}
	

}
