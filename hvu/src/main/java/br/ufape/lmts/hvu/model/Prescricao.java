package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Prescricao  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Double dose;
	private String frequencia;
	private String periodo;
	@OneToOne
	private Medicamento medicamento; 

	public Prescricao () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	Double getDose () {
		return this.dose;
	}
	
	public void setDose (Double dose) {
		this.dose = dose;
	}
	
	public 	String getFrequencia () {
		return this.frequencia;
	}
	
	public void setFrequencia (String frequencia) {
		this.frequencia = frequencia;
	}
	
	public 	String getPeriodo () {
		return this.periodo;
	}
	
	public void setPeriodo (String periodo) {
		this.periodo = periodo;
	}
	
	public Medicamento getMedicamento () {
		return this.medicamento;
	}
	
	public void setMedicamento (Medicamento medicamento) {
		this.medicamento = medicamento;
	}
}