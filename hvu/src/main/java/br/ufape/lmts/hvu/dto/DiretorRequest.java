package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class DiretorRequest extends UsuarioRequest {
	private String matricula;


	public Diretor toDiretor() {
		Diretor obj = new Diretor();
		fillDiretor(obj);
		return obj;
	}
	protected void fillDiretor(Diretor obj) {
		this.fillUsuario(obj);		
		obj.setMatricula(getMatricula());
	}

	public DiretorRequest () {
		
	}
	
	public 	String getMatricula () {
		return this.matricula;
	}

}
