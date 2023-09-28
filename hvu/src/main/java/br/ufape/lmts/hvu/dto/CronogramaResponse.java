package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;

public  class CronogramaResponse  {
	private String nome;
	private String rotina;
	private List<MedicoResponse> medico; 



	public CronogramaResponse(Cronograma obj) {
		this.nome = obj.getNome();
		this.rotina = obj.getRotina();
		this.medico = obj.getMedico()
			.stream()
			.map(MedicoResponse::new)
			.toList();	

	}

	
	public 	String getNome () {
		return this.nome;
	}

	public String getRotina () {
		return this.rotina;
	}

	public List<MedicoResponse> getMedico () {
		return this.medico;
	}
}
