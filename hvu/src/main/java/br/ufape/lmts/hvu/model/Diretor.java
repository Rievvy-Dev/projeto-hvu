package br.ufape.lmts.hvu.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Diretor")
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