package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.Raca;

public interface RacaServiceInterface {
	Raca saveRaca(Raca o);
	Raca findRacaById(long id);
	Raca updateRaca(Raca u);
	void deleteRaca(Raca u);
	void deleteRaca(long id);
	List<Raca> getAllRaca();
    
    

    
}