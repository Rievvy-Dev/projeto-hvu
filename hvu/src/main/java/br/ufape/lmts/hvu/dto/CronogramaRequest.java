package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class CronogramaRequest  {
	private String nome;
	private Json rotina;
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

	public 	Json getRotina () {
		return this.rotina;
	}

	public List<MedicoRequest> getMedico () {
		return this.medico;
	}
}
