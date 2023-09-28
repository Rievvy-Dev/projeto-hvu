package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.Parecer;

public interface ParecerServiceInterface {
	Parecer saveParecer(Parecer o);
	Parecer findParecerById(long id);
	Parecer updateParecer(Parecer u);
	void deleteParecer(Parecer u);
	void deleteParecer(long id);
	List<Parecer> getAllParecer();
    
    

    
}