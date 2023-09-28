package br.ufape.lmts.hvu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.ufape.lmts.hvu.model.ExameFisicoEspecial;
import br.ufape.lmts.hvu.facade.Facade;
import br.ufape.lmts.hvu.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class ExameFisicoEspecialController {
	@Autowired
	private Facade facade;
	
	@GetMapping("exameFisicoEspecial")
	public List<ExameFisicoEspecialResponse> getAllExameFisicoEspecial() {
		return facade.getAllExameFisicoEspecial()
			.stream()
			.map(ExameFisicoEspecialResponse::new)
			.toList();
	}
	
	@PostMapping("exameFisicoEspecial")
	public ExameFisicoEspecialResponse createExameFisicoEspecial(@Valid @RequestBody ExameFisicoEspecialRequest newObj) {
		return new ExameFisicoEspecialResponse(facade.saveExameFisicoEspecial(newObj.toExameFisicoEspecial()));
	}
	
	@GetMapping("exameFisicoEspecial/{id}")
	public ExameFisicoEspecialResponse getExameFisicoEspecialById(@PathVariable Long id) {
		try {
			return new ExameFisicoEspecialResponse(facade.findExameFisicoEspecialById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ExameFisicoEspecial " + id + " not found.");
		}
	}
	
	@PostMapping("exameFisicoEspecial/{id}")
	public ExameFisicoEspecialResponse updateExameFisicoEspecial(@PathVariable Long id, @Valid @RequestBody ExameFisicoEspecialRequest obj) {
		try {
			ExameFisicoEspecial o = obj.toExameFisicoEspecial();
			o.setId(id);
			return new ExameFisicoEspecialResponse(facade.updateExameFisicoEspecial(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ExameFisicoEspecial " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("exameFisicoEspecial/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteExameFisicoEspecial(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ExameFisicoEspecial " + id + " not found.");
		}
		
	}
	

}
