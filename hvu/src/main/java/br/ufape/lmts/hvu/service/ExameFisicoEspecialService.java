package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.ExameFisicoEspecialRepository;
import br.ufape.lmts.hvu.model.ExameFisicoEspecial;

@Service
public class ExameFisicoEspecialService implements ExameFisicoEspecialServiceInterface {
	@Autowired
	ExameFisicoEspecialRepository repository;

	public ExameFisicoEspecialService(ExameFisicoEspecialRepository repository) {
		this.repository = repository;
	}

	public ExameFisicoEspecialService() {
	}
	
	public ExameFisicoEspecialRepository getRepository() {
		return repository;
	}

	public void setDao(ExameFisicoEspecialRepository repository) {
		this.repository = repository;
	}	

	public ExameFisicoEspecial saveExameFisicoEspecial(ExameFisicoEspecial newInstance) {
		return repository.save(newInstance);
	}

	public ExameFisicoEspecial updateExameFisicoEspecial(ExameFisicoEspecial transientObject) {
		return repository.save(transientObject);
	}

	public ExameFisicoEspecial findExameFisicoEspecialById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist ExameFisicoEspecial with id = " + id));
	}

	public List<ExameFisicoEspecial> getAllExameFisicoEspecial(){
		return repository.findAll();
	}

	public void deleteExameFisicoEspecial(ExameFisicoEspecial persistentObject){
		this.deleteExameFisicoEspecial(persistentObject.getId());
		
	}
	
	public void deleteExameFisicoEspecial(long id){
		ExameFisicoEspecial obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist ExameFisicoEspecial with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}