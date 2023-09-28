package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Especialidade  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String descricao;
	@OneToMany
	@JoinColumn(name = "especialidade_id")
	private List<Vaga> vaga; 
	@OneToMany
	@JoinColumn(name = "especialidade_id")
	private List<Cronograma> cronograma; 
	@ManyToMany
	private List<Medico> medico; 

	public Especialidade () {
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
	
	public 	String getDescricao () {
		return this.descricao;
	}
	
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
	
	public  List<Vaga>  getVaga () {
		return this.vaga;
	}
	
	public void setVaga ( List<Vaga>  vaga) {
		this.vaga = vaga;
	}
	public  List<Cronograma>  getCronograma () {
		return this.cronograma;
	}
	
	public void setCronograma ( List<Cronograma>  cronograma) {
		this.cronograma = cronograma;
	}
	public  List<Medico>  getMedico () {
		return this.medico;
	}
	
	public void setMedico ( List<Medico>  medico) {
		this.medico = medico;
	}
}