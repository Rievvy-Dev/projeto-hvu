package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class DiretorResponse extends UsuarioResponse {
	private String matricula;



	public DiretorResponse(Diretor obj) {
		super(obj);		
		this.matricula = obj.getMatricula();

	}

	
	public 	String getMatricula () {
		return this.matricula;
	}

}
