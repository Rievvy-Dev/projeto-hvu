package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class PrescricaoResponse  {
	private Double dose;
	private String frequencia;
	private String periodo;
	private MedicamentoResponse medicamento; 



	public PrescricaoResponse(Prescricao obj) {
		this.dose = obj.getDose();
		this.frequencia = obj.getFrequencia();
		this.periodo = obj.getPeriodo();
		this.medicamento = new MedicamentoResponse(obj.getMedicamento());

	}

	
	public 	Double getDose () {
		return this.dose;
	}

	public 	String getFrequencia () {
		return this.frequencia;
	}

	public 	String getPeriodo () {
		return this.periodo;
	}

	public MedicamentoResponse getMedicamento () {
		return this.medicamento;
	}
}
