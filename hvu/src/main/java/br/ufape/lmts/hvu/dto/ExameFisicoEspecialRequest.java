package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class ExameFisicoEspecialRequest  {
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


	public ExameFisicoEspecial toExameFisicoEspecial() {
		ExameFisicoEspecial obj = new ExameFisicoEspecial();
		fillExameFisicoEspecial(obj);
		return obj;
	}
	protected void fillExameFisicoEspecial(ExameFisicoEspecial obj) {
		obj.setSistemaRespiratorio(getSistemaRespiratorio());
		obj.setSistemaDigestorio(getSistemaDigestorio());
		obj.setSistemaCardioVascular(getSistemaCardioVascular());
		obj.setSistemaNefrourinario(getSistemaNefrourinario());
		obj.setPele(getPele());
		obj.setOuvidos(getOuvidos());
		obj.setSistemaNeurologico(getSistemaNeurologico());
		obj.setSistemaLocomotor(getSistemaLocomotor());
		obj.setSistemaReprodutor(getSistemaReprodutor());
		obj.setOlhos(getOlhos());
	}

	public ExameFisicoEspecialRequest () {
		
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
