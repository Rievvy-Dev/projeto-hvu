package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.Vacina;

public interface VacinaServiceInterface {
	Vacina saveVacina(Vacina o);
	Vacina findVacinaById(long id);
	Vacina updateVacina(Vacina u);
	void deleteVacina(Vacina u);
	void deleteVacina(long id);
	List<Vacina> getAllVacina();
    
    

    
}