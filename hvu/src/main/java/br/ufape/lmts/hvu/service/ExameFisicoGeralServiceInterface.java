package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.ExameFisicoGeral;

public interface ExameFisicoGeralServiceInterface {
	ExameFisicoGeral saveExameFisicoGeral(ExameFisicoGeral o);
	ExameFisicoGeral findExameFisicoGeralById(long id);
	ExameFisicoGeral updateExameFisicoGeral(ExameFisicoGeral u);
	void deleteExameFisicoGeral(ExameFisicoGeral u);
	void deleteExameFisicoGeral(long id);
	List<ExameFisicoGeral> getAllExameFisicoGeral();
    
    

    
}