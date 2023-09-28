package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Raca  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String porte;
	private String descricao;

	public Raca () {
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
	
	public 	String getPorte () {
		return this.porte;
	}
	
	public void setPorte (String porte) {
		this.porte = porte;
	}
	
	public 	String getDescricao () {
		return this.descricao;
	}
	
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
	
}