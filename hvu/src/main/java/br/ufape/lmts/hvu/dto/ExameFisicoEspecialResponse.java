package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class ExameFisicoEspecialResponse  {
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



	public ExameFisicoEspecialResponse(ExameFisicoEspecial obj) {
		this.sistemaRespiratorio = obj.getSistemaRespiratorio();
		this.sistemaDigestorio = obj.getSistemaDigestorio();
		this.sistemaCardioVascular = obj.getSistemaCardioVascular();
		this.sistemaNefrourinario = obj.getSistemaNefrourinario();
		this.pele = obj.getPele();
		this.ouvidos = obj.getOuvidos();
		this.sistemaNeurologico = obj.getSistemaNeurologico();
		this.sistemaLocomotor = obj.getSistemaLocomotor();
		this.sistemaReprodutor = obj.getSistemaReprodutor();
		this.olhos = obj.getOlhos();

	}

	
	public 	String getSistemaRespiratorio () {
		return this.sistemaRespiratorio;
	}

	public 	String getSistemaDigestorio () {
		return this.sistemaDigestorio;
	}

	public 	String getSistemaCardioVascular () {
		return this.sistemaCardioVascular;
	}

	public 	String getSistemaNefrourinario () {
		return this.sistemaNefrourinario;
	}

	public 	String getPele () {
		return this.pele;
	}

	public 	String getOuvidos () {
		return this.ouvidos;
	}

	public 	String getSistemaNeurologico () {
		return this.sistemaNeurologico;
	}

	public 	String getSistemaLocomotor () {
		return this.sistemaLocomotor;
	}

	public 	String getSistemaReprodutor () {
		return this.sistemaReprodutor;
	}

	public 	String getOlhos () {
		return this.olhos;
	}

}
