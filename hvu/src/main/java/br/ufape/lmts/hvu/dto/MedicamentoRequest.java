package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class MedicamentoRequest  {
	private String nome;
	private String descricao;


	public Medicamento toMedicamento() {
		Medicamento obj = new Medicamento();
		fillMedicamento(obj);
		return obj;
	}
	protected void fillMedicamento(Medicamento obj) {
		obj.setNome(getNome());
		obj.setDescricao(getDescricao());
	}

	public MedicamentoRequest () {
		
	}
	
	public 	String getNome () {
		return this.nome;
	}

	public 	String getDescricao () {
		return this.descricao;
	}

}
