package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class ExameFisicoGeralResponse  {
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



	public ExameFisicoGeralResponse(ExameFisicoGeral obj) {
		this.postura = obj.getPostura();
		this.outraPostura = obj.getOutraPostura();
		this.nivelConsciencia = obj.getNivelConsciencia();
		this.temperatura = obj.getTemperatura();
		this.scoreCorporal = obj.getScoreCorporal();
		this.frequenciaCardiaca = obj.getFrequenciaCardiaca();
		this.frequenciaRespiratoria = obj.getFrequenciaRespiratoria();
		this.hidratacao = obj.getHidratacao();
		this.tpc = obj.getTpc();
		this.tugorCutaneo = obj.getTugorCutaneo();
		this.mucosas = obj.getMucosas();
		this.linfonodos = obj.getLinfonodos();

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
