package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class RacaResponse  {
	private String nome;
	private String porte;
	private String descricao;



	public RacaResponse(Raca obj) {
		this.nome = obj.getNome();
		this.porte = obj.getPorte();
		this.descricao = obj.getDescricao();

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
