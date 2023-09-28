package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class ConsultaRequest  {
	private Double pesoAtual;
	private float idade;
	private String queixa;
	private Enum tipoConsulta;
	private String alteracoesClinicasDiversas;
	private String suspeitasClinicas;
	private VagaRequest vaga; 
	private EstagiarioRequest estagiario; 
	private ExameFisicoEspecialRequest exameFisicoEspecial; 
	private ExameFisicoGeralRequest exameFisicoGeral; 
	private ParecerRequest parecer; 
	private MedicoRequest medico; 
	private List<PrescricaoRequest> prescricao; 
	private List<ExameComplementarRequest> exameComplementar; 


	public Consulta toConsulta() {
		Consulta obj = new Consulta();
		fillConsulta(obj);
		return obj;
	}
	protected void fillConsulta(Consulta obj) {
		obj.setPesoAtual(getPesoAtual());
		obj.setIdade(getIdade());
		obj.setQueixa(getQueixa());
		obj.setTipoConsulta(getTipoConsulta());
		obj.setAlteracoesClinicasDiversas(getAlteracoesClinicasDiversas());
		obj.setSuspeitasClinicas(getSuspeitasClinicas());
		obj.setVaga(getVaga().toVaga());	
		obj.setEstagiario(getEstagiario().toEstagiario());	
		obj.setExameFisicoEspecial(getExameFisicoEspecial().toExameFisicoEspecial());	
		obj.setExameFisicoGeral(getExameFisicoGeral().toExameFisicoGeral());	
		obj.setParecer(getParecer().toParecer());	
		obj.setMedico(getMedico().toMedico());	
		obj.setPrescricao(getPrescricao()
			.stream()
			.map(a -> a.toPrescricao())
			.toList());	
		obj.setExameComplementar(getExameComplementar()
			.stream()
			.map(a -> a.toExameComplementar())
			.toList());	
	}

	public ConsultaRequest () {
		
	}
	
	public 	Double getPesoAtual () {
		return this.pesoAtual;
	}

	public 	float getIdade () {
		return this.idade;
	}

	public 	String getQueixa () {
		return this.queixa;
	}

	public 	Enum getTipoConsulta () {
		return this.tipoConsulta;
	}

	public 	String getAlteracoesClinicasDiversas () {
		return this.alteracoesClinicasDiversas;
	}

	public 	String getSuspeitasClinicas () {
		return this.suspeitasClinicas;
	}

	public VagaRequest getVaga () {
		return this.vaga;
	}
	public EstagiarioRequest getEstagiario () {
		return this.estagiario;
	}
	public ExameFisicoEspecialRequest getExameFisicoEspecial () {
		return this.exameFisicoEspecial;
	}
	public ExameFisicoGeralRequest getExameFisicoGeral () {
		return this.exameFisicoGeral;
	}
	public ParecerRequest getParecer () {
		return this.parecer;
	}
	public MedicoRequest getMedico () {
		return this.medico;
	}
	public List<PrescricaoRequest> getPrescricao () {
		return this.prescricao;
	}
	public List<ExameComplementarRequest> getExameComplementar () {
		return this.exameComplementar;
	}
}
