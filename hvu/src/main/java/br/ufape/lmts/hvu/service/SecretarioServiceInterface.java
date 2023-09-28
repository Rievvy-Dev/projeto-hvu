package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.Secretario;

public interface SecretarioServiceInterface {
	Secretario saveSecretario(Secretario o);
	Secretario findSecretarioById(long id);
	Secretario updateSecretario(Secretario u);
	void deleteSecretario(Secretario u);
	void deleteSecretario(long id);
	List<Secretario> getAllSecretario();
    
    

    
}