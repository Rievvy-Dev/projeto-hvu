package br.ufape.lmts.hvu.model;

import jakarta.persistence.Entity;

@Entity
public  class Diretor extends Usuario {
	private String matricula;

	public Diretor () {
		super();
	}
	
	public 	String getMatricula () {
		return this.matricula;
	}
	
	public void setMatricula (String matricula) {
		this.matricula = matricula;
	}
	
}