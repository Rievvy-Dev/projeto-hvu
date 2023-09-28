package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Cronograma  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private Json rotina;
	@OneToMany
	@JoinColumn(name = "cronograma_id")
	private List<Medico> medico; 

	public Cronograma () {
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
	
	public 	Json getRotina () {
		return this.rotina;
	}
	
	public void setRotina (Json rotina) {
		this.rotina = rotina;
	}
	
	public  List<Medico>  getMedico () {
		return this.medico;
	}
	
	public void setMedico ( List<Medico>  medico) {
		this.medico = medico;
	}
}