package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class EstagiarioRequest  {
	private String nome;


	public Estagiario toEstagiario() {
		Estagiario obj = new Estagiario();
		fillEstagiario(obj);
		return obj;
	}
	protected void fillEstagiario(Estagiario obj) {
		obj.setNome(getNome());
	}

	public EstagiarioRequest () {
		
	}
	
	public 	String getNome () {
		return this.nome;
	}

}
