package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class ExameFisicoGeral  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Enum postura;
	private String outraPostura;
	private String nivelConsciencia;
	private String temperatura;
	private String scoreCorporal;
	private String frequenciaCardiaca;
	private String frequenciaRespiratoria;
	private Enum hidratacao;
	private String tpc;
	private Enum tugorCutaneo;
	private Enum mucosas;
	private Enum linfonodos;

	public ExameFisicoGeral () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	Enum getPostura () {
		return this.postura;
	}
	
	public void setPostura (Enum postura) {
		this.postura = postura;
	}
	
	public 	String getOutraPostura () {
		return this.outraPostura;
	}
	
	public void setOutraPostura (String outraPostura) {
		this.outraPostura = outraPostura;
	}
	
	public 	String getNivelConsciencia () {
		return this.nivelConsciencia;
	}
	
	public void setNivelConsciencia (String nivelConsciencia) {
		this.nivelConsciencia = nivelConsciencia;
	}
	
	public 	String getTemperatura () {
		return this.temperatura;
	}
	
	public void setTemperatura (String temperatura) {
		this.temperatura = temperatura;
	}
	
	public 	String getScoreCorporal () {
		return this.scoreCorporal;
	}
	
	public void setScoreCorporal (String scoreCorporal) {
		this.scoreCorporal = scoreCorporal;
	}
	
	public 	String getFrequenciaCardiaca () {
		return this.frequenciaCardiaca;
	}
	
	public void setFrequenciaCardiaca (String frequenciaCardiaca) {
		this.frequenciaCardiaca = frequenciaCardiaca;
	}
	
	public 	String getFrequenciaRespiratoria () {
		return this.frequenciaRespiratoria;
	}
	
	public void setFrequenciaRespiratoria (String frequenciaRespiratoria) {
		this.frequenciaRespiratoria = frequenciaRespiratoria;
	}
	
	public 	Enum getHidratacao () {
		return this.hidratacao;
	}
	
	public void setHidratacao (Enum hidratacao) {
		this.hidratacao = hidratacao;
	}
	
	public 	String getTpc () {
		return this.tpc;
	}
	
	public void setTpc (String tpc) {
		this.tpc = tpc;
	}
	
	public 	Enum getTugorCutaneo () {
		return this.tugorCutaneo;
	}
	
	public void setTugorCutaneo (Enum tugorCutaneo) {
		this.tugorCutaneo = tugorCutaneo;
	}
	
	public 	Enum getMucosas () {
		return this.mucosas;
	}
	
	public void setMucosas (Enum mucosas) {
		this.mucosas = mucosas;
	}
	
	public 	Enum getLinfonodos () {
		return this.linfonodos;
	}
	
	public void setLinfonodos (Enum linfonodos) {
		this.linfonodos = linfonodos;
	}
	
}