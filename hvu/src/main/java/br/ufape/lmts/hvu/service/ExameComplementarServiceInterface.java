package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.ExameComplementar;

public interface ExameComplementarServiceInterface {
	ExameComplementar saveExameComplementar(ExameComplementar o);
	ExameComplementar findExameComplementarById(long id);
	ExameComplementar updateExameComplementar(ExameComplementar u);
	void deleteExameComplementar(ExameComplementar u);
	void deleteExameComplementar(long id);
	List<ExameComplementar> getAllExameComplementar();
    
    

    
}