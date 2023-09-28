package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class EstagiarioResponse  {
	private String nome;



	public EstagiarioResponse(Estagiario obj) {
		this.nome = obj.getNome();

	}

	
	public 	String getNome () {
		return this.nome;
	}

}
