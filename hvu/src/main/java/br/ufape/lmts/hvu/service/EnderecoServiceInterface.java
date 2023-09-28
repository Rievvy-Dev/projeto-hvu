package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.Endereco;

public interface EnderecoServiceInterface {
	Endereco saveEndereco(Endereco o);
	Endereco findEnderecoById(long id);
	Endereco updateEndereco(Endereco u);
	void deleteEndereco(Endereco u);
	void deleteEndereco(long id);
	List<Endereco> getAllEndereco();
    
    

    
}