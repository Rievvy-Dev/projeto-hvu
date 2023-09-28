package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class SecretarioRequest extends UsuarioRequest {


	public Secretario toSecretario() {
		Secretario obj = new Secretario();
		fillSecretario(obj);
		return obj;
	}
	protected void fillSecretario(Secretario obj) {
		this.fillUsuario(obj);		
	}

	public SecretarioRequest () {
		
	}
	
}
