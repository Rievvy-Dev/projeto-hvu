package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class EspecieRequest  {
	private String nome;
	private String descricao;
	private List<RacaRequest> raca; 


	public Especie toEspecie() {
		Especie obj = new Especie();
		fillEspecie(obj);
		return obj;
	}
	protected void fillEspecie(Especie obj) {
		obj.setNome(getNome());
		obj.setDescricao(getDescricao());
		obj.setRaca(getRaca()
			.stream()
			.map(a -> a.toRaca())
			.toList());	
	}

	public EspecieRequest () {
		
	}
	
	public 	String getNome () {
		return this.nome;
	}

	public 	String getDescricao () {
		return this.descricao;
	}

	public List<RacaRequest> getRaca () {
		return this.raca;
	}
}
