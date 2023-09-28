package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class PrescricaoRequest  {
	private Double dose;
	private String frequencia;
	private String periodo;
	private MedicamentoRequest medicamento; 


	public Prescricao toPrescricao() {
		Prescricao obj = new Prescricao();
		fillPrescricao(obj);
		return obj;
	}
	protected void fillPrescricao(Prescricao obj) {
		obj.setDose(getDose());
		obj.setFrequencia(getFrequencia());
		obj.setPeriodo(getPeriodo());
		obj.setMedicamento(getMedicamento().toMedicamento());	
	}

	public PrescricaoRequest () {
		
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

	public MedicamentoRequest getMedicamento () {
		return this.medicamento;
	}
}
