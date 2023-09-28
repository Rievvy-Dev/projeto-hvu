package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Parecer  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String observacoes;
	private String diagnostico;
	private String prognostico;

	public Parecer () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	String getObservacoes () {
		return this.observacoes;
	}
	
	public void setObservacoes (String observacoes) {
		this.observacoes = observacoes;
	}
	
	public 	String getDiagnostico () {
		return this.diagnostico;
	}
	
	public void setDiagnostico (String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	public 	String getPrognostico () {
		return this.prognostico;
	}
	
	public void setPrognostico (String prognostico) {
		this.prognostico = prognostico;
	}
	
}