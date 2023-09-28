package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class VacinaResponse  {
	private String nome;



	public VacinaResponse(Vacina obj) {
		this.nome = obj.getNome();

	}

	
	public 	String getNome () {
		return this.nome;
	}

}
