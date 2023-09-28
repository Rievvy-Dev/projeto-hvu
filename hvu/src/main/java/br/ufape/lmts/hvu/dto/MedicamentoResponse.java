package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class MedicamentoResponse  {
	private String nome;
	private String descricao;



	public MedicamentoResponse(Medicamento obj) {
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();

	}

	
	public 	String getNome () {
		return this.nome;
	}

	public 	String getDescricao () {
		return this.descricao;
	}

}
