package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class ExameFisicoGeralRequest  {
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


	public ExameFisicoGeral toExameFisicoGeral() {
		ExameFisicoGeral obj = new ExameFisicoGeral();
		fillExameFisicoGeral(obj);
		return obj;
	}
	protected void fillExameFisicoGeral(ExameFisicoGeral obj) {
		obj.setPostura(getPostura());
		obj.setOutraPostura(getOutraPostura());
		obj.setNivelConsciencia(getNivelConsciencia());
		obj.setTemperatura(getTemperatura());
		obj.setScoreCorporal(getScoreCorporal());
		obj.setFrequenciaCardiaca(getFrequenciaCardiaca());
		obj.setFrequenciaRespiratoria(getFrequenciaRespiratoria());
		obj.setHidratacao(getHidratacao());
		obj.setTpc(getTpc());
		obj.setTugorCutaneo(getTugorCutaneo());
		obj.setMucosas(getMucosas());
		obj.setLinfonodos(getLinfonodos());
	}

	public ExameFisicoGeralRequest () {
		
	}
	
	public 	Enum getPostura () {
		return this.postura;
	}

	public 	String getOutraPostura () {
		return this.outraPostura;
	}

	public 	String getNivelConsciencia () {
		return this.nivelConsciencia;
	}

	public 	String getTemperatura () {
		return this.temperatura;
	}

	public 	String getScoreCorporal () {
		return this.scoreCorporal;
	}

	public 	String getFrequenciaCardiaca () {
		return this.frequenciaCardiaca;
	}

	public 	String getFrequenciaRespiratoria () {
		return this.frequenciaRespiratoria;
	}

	public 	Enum getHidratacao () {
		return this.hidratacao;
	}

	public 	String getTpc () {
		return this.tpc;
	}

	public 	Enum getTugorCutaneo () {
		return this.tugorCutaneo;
	}

	public 	Enum getMucosas () {
		return this.mucosas;
	}

	public 	Enum getLinfonodos () {
		return this.linfonodos;
	}

}
