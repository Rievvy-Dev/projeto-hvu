package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class ParecerRequest  {
	private String observacoes;
	private String diagnostico;
	private String prognostico;


	public Parecer toParecer() {
		Parecer obj = new Parecer();
		fillParecer(obj);
		return obj;
	}
	protected void fillParecer(Parecer obj) {
		obj.setObservacoes(getObservacoes());
		obj.setDiagnostico(getDiagnostico());
		obj.setPrognostico(getPrognostico());
	}

	public ParecerRequest () {
		
	}
	
	public 	String getObservacoes () {
		return this.observacoes;
	}

	public 	String getDiagnostico () {
		return this.diagnostico;
	}

	public 	String getPrognostico () {
		return this.prognostico;
	}

}
