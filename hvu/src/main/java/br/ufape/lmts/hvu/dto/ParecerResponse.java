package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class ParecerResponse  {
	private String observacoes;
	private String diagnostico;
	private String prognostico;



	public ParecerResponse(Parecer obj) {
		this.observacoes = obj.getObservacoes();
		this.diagnostico = obj.getDiagnostico();
		this.prognostico = obj.getPrognostico();

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
