package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class ExameFisicoEspecial  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String sistemaRespiratorio;
	private String sistemaDigestorio;
	private String sistemaCardioVascular;
	private String sistemaNefrourinario;
	private String pele;
	private String ouvidos;
	private String sistemaNeurologico;
	private String sistemaLocomotor;
	private String sistemaReprodutor;
	private String olhos;

	public ExameFisicoEspecial () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	String getSistemaRespiratorio () {
		return this.sistemaRespiratorio;
	}
	
	public void setSistemaRespiratorio (String sistemaRespiratorio) {
		this.sistemaRespiratorio = sistemaRespiratorio;
	}
	
	public 	String getSistemaDigestorio () {
		return this.sistemaDigestorio;
	}
	
	public void setSistemaDigestorio (String sistemaDigestorio) {
		this.sistemaDigestorio = sistemaDigestorio;
	}
	
	public 	String getSistemaCardioVascular () {
		return this.sistemaCardioVascular;
	}
	
	public void setSistemaCardioVascular (String sistemaCardioVascular) {
		this.sistemaCardioVascular = sistemaCardioVascular;
	}
	
	public 	String getSistemaNefrourinario () {
		return this.sistemaNefrourinario;
	}
	
	public void setSistemaNefrourinario (String sistemaNefrourinario) {
		this.sistemaNefrourinario = sistemaNefrourinario;
	}
	
	public 	String getPele () {
		return this.pele;
	}
	
	public void setPele (String pele) {
		this.pele = pele;
	}
	
	public 	String getOuvidos () {
		return this.ouvidos;
	}
	
	public void setOuvidos (String ouvidos) {
		this.ouvidos = ouvidos;
	}
	
	public 	String getSistemaNeurologico () {
		return this.sistemaNeurologico;
	}
	
	public void setSistemaNeurologico (String sistemaNeurologico) {
		this.sistemaNeurologico = sistemaNeurologico;
	}
	
	public 	String getSistemaLocomotor () {
		return this.sistemaLocomotor;
	}
	
	public void setSistemaLocomotor (String sistemaLocomotor) {
		this.sistemaLocomotor = sistemaLocomotor;
	}
	
	public 	String getSistemaReprodutor () {
		return this.sistemaReprodutor;
	}
	
	public void setSistemaReprodutor (String sistemaReprodutor) {
		this.sistemaReprodutor = sistemaReprodutor;
	}
	
	public 	String getOlhos () {
		return this.olhos;
	}
	
	public void setOlhos (String olhos) {
		this.olhos = olhos;
	}
	
}