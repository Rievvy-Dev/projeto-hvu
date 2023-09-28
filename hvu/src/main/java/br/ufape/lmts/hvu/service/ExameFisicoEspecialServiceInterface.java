package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.ExameFisicoEspecial;

public interface ExameFisicoEspecialServiceInterface {
	ExameFisicoEspecial saveExameFisicoEspecial(ExameFisicoEspecial o);
	ExameFisicoEspecial findExameFisicoEspecialById(long id);
	ExameFisicoEspecial updateExameFisicoEspecial(ExameFisicoEspecial u);
	void deleteExameFisicoEspecial(ExameFisicoEspecial u);
	void deleteExameFisicoEspecial(long id);
	List<ExameFisicoEspecial> getAllExameFisicoEspecial();
    
    

    
}