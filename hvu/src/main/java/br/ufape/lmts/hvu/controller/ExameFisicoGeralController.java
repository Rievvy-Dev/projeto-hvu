package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.ExameFisicoGeral;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class ExameFisicoGeralController {
	@Autowired
	private Facade facade;
	
	@GetMapping("exameFisicoGeral")
	public List<ExameFisicoGeralResponse> getAllExameFisicoGeral() {
		return facade.getAllExameFisicoGeral()
			.stream()
			.map(ExameFisicoGeralResponse::new)
			.toList();
	}
	
	@PostMapping("exameFisicoGeral")
	public ExameFisicoGeralResponse createExameFisicoGeral(@Valid @RequestBody ExameFisicoGeralRequest newObj) {
		return new ExameFisicoGeralResponse(facade.saveExameFisicoGeral(newObj.toExameFisicoGeral()));
	}
	
	@GetMapping("exameFisicoGeral/{id}")
	public ExameFisicoGeralResponse getExameFisicoGeralById(@PathVariable Long id) {
		try {
			return new ExameFisicoGeralResponse(facade.findExameFisicoGeralById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ExameFisicoGeral " + id + " not found.");
		}
	}
	
	@PostMapping("exameFisicoGeral/{id}")
	public ExameFisicoGeralResponse updateExameFisicoGeral(@PathVariable Long id, @Valid @RequestBody ExameFisicoGeralRequest obj) {
		try {
			ExameFisicoGeral o = obj.toExameFisicoGeral();
			o.setId(id);
			return new ExameFisicoGeralResponse(facade.updateExameFisicoGeral(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ExameFisicoGeral " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("exameFisicoGeral/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteExameFisicoGeral(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ExameFisicoGeral " + id + " not found.");
		}
		
	}
	

}
