package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.ExameFisicoGeralRepository;
import br.ufape.lmts.hvu.model.ExameFisicoGeral;

@Service
public class ExameFisicoGeralService implements ExameFisicoGeralServiceInterface {
	@Autowired
	ExameFisicoGeralRepository repository;

	public ExameFisicoGeralService(ExameFisicoGeralRepository repository) {
		this.repository = repository;
	}

	public ExameFisicoGeralService() {
	}
	
	public ExameFisicoGeralRepository getRepository() {
		return repository;
	}

	public void setDao(ExameFisicoGeralRepository repository) {
		this.repository = repository;
	}	

	public ExameFisicoGeral saveExameFisicoGeral(ExameFisicoGeral newInstance) {
		return repository.save(newInstance);
	}

	public ExameFisicoGeral updateExameFisicoGeral(ExameFisicoGeral transientObject) {
		return repository.save(transientObject);
	}

	public ExameFisicoGeral findExameFisicoGeralById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist ExameFisicoGeral with id = " + id));
	}

	public List<ExameFisicoGeral> getAllExameFisicoGeral(){
		return repository.findAll();
	}

	public void deleteExameFisicoGeral(ExameFisicoGeral persistentObject){
		this.deleteExameFisicoGeral(persistentObject.getId());
		
	}
	
	public void deleteExameFisicoGeral(long id){
		ExameFisicoGeral obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist ExameFisicoGeral with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}