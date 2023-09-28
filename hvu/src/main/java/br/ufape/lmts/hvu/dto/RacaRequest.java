package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class RacaRequest  {
	private String nome;
	private String porte;
	private String descricao;


	public Raca toRaca() {
		Raca obj = new Raca();
		fillRaca(obj);
		return obj;
	}
	protected void fillRaca(Raca obj) {
		obj.setNome(getNome());
		obj.setPorte(getPorte());
		obj.setDescricao(getDescricao());
	}

	public RacaRequest () {
		
	}
	
	public 	String getNome () {
		return this.nome;
	}

	public 	String getPorte () {
		return this.porte;
	}

	public 	String getDescricao () {
		return this.descricao;
	}

}
