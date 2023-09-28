package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.Estagiario;

public interface EstagiarioServiceInterface {
	Estagiario saveEstagiario(Estagiario o);
	Estagiario findEstagiarioById(long id);
	Estagiario updateEstagiario(Estagiario u);
	void deleteEstagiario(Estagiario u);
	void deleteEstagiario(long id);
	List<Estagiario> getAllEstagiario();
    
    

    
}