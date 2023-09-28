package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.Usuario;

public interface UsuarioServiceInterface {
	Usuario saveUsuario(Usuario o);
	Usuario findUsuarioById(long id);
	Usuario updateUsuario(Usuario u);
	void deleteUsuario(Usuario u);
	void deleteUsuario(long id);
	List<Usuario> getAllUsuario();
    
    

    
}