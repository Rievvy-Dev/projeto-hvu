package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.TipoExame;

public interface TipoExameServiceInterface {
	TipoExame saveTipoExame(TipoExame o);
	TipoExame findTipoExameById(long id);
	TipoExame updateTipoExame(TipoExame u);
	void deleteTipoExame(TipoExame u);
	void deleteTipoExame(long id);
	List<TipoExame> getAllTipoExame();
    
    

    
}