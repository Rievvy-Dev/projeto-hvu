package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class EspecieResponse  {
	private String nome;
	private String descricao;
	private List<RacaResponse> raca; 



	public EspecieResponse(Especie obj) {
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
		this.raca = obj.getRaca()
			.stream()
			.map(RacaResponse::new)
			.toList();

	}

	
	public 	String getNome () {
		return this.nome;
	}

	public 	String getDescricao () {
		return this.descricao;
	}

	public List<RacaResponse> getRaca () {
		return this.raca;
	}
}
