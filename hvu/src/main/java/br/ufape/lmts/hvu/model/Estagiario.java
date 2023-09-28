package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Estagiario  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;

	public Estagiario () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
}