package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class VacinaRequest  {
	private String nome;


	public Vacina toVacina() {
		Vacina obj = new Vacina();
		fillVacina(obj);
		return obj;
	}
	protected void fillVacina(Vacina obj) {
		obj.setNome(getNome());
	}

	public VacinaRequest () {
		
	}
	
	public 	String getNome () {
		return this.nome;
	}

}
