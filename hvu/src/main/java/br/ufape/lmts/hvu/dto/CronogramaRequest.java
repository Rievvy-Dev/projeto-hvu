package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;
import com.fasterxml.jackson.databind.util.JSONPObject;


public  class CronogramaRequest  {
	private String nome;
	private JSONPObject rotina;
	private List<MedicoRequest> medico; 


	public Cronograma toCronograma() {
		Cronograma obj = new Cronograma();
		fillCronograma(obj);
		return obj;
	}
	protected void fillCronograma(Cronograma obj) {
		obj.setNome(getNome());
		obj.setRotina(getRotina());
		obj.setMedico(getMedico()
			.stream()
			.map(a -> a.toMedico())
			.toList());	
	}

	public CronogramaRequest () {
		
	}
	
	public 	String getNome () {
		return this.nome;
	}

	public 	JSONPObject getRotina () {
		return this.rotina;
	}

	public List<MedicoRequest> getMedico () {
		return this.medico;
	}
}
