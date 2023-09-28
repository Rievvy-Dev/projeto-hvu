package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class TipoExame  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Enum nome;

	public TipoExame () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	Enum getNome () {
		return this.nome;
	}
	
	public void setNome (Enum nome) {
		this.nome = nome;
	}
	
}