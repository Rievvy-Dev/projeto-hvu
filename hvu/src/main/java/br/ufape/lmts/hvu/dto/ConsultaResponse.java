package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class ConsultaResponse  {
	private Double pesoAtual;
	private float idade;
	private String queixa;
	private Enum tipoConsulta;
	private String alteracoesClinicasDiversas;
	private String suspeitasClinicas;
	private VagaResponse vaga; 
	private EstagiarioResponse estagiario; 
	private ExameFisicoEspecialResponse exameFisicoEspecial; 
	private ExameFisicoGeralResponse exameFisicoGeral; 
	private ParecerResponse parecer; 
	private MedicoResponse medico; 
	private List<PrescricaoResponse> prescricao; 
	private List<ExameComplementarResponse> exameComplementar; 



	public ConsultaResponse(Consulta obj) {
		this.pesoAtual = obj.getPesoAtual();
		this.idade = obj.getIdade();
		this.queixa = obj.getQueixa();
		this.tipoConsulta = obj.getTipoConsulta();
		this.alteracoesClinicasDiversas = obj.getAlteracoesClinicasDiversas();
		this.suspeitasClinicas = obj.getSuspeitasClinicas();
		this.vaga = new VagaResponse(obj.getVaga());
		this.estagiario = new EstagiarioResponse(obj.getEstagiario());
		this.exameFisicoEspecial = new ExameFisicoEspecialResponse(obj.getExameFisicoEspecial());
		this.exameFisicoGeral = new ExameFisicoGeralResponse(obj.getExameFisicoGeral());
		this.parecer = new ParecerResponse(obj.getParecer());
		this.medico = new MedicoResponse(obj.getMedico());		this.prescricao = obj.getPrescricao()
			.stream()
			.map(PrescricaoResponse::new)
			.toList();	
		this.exameComplementar = obj.getExameComplementar()
			.stream()
			.map(ExameComplementarResponse::new)
			.toList();	

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

	public VagaResponse getVaga () {
		return this.vaga;
	}
	public EstagiarioResponse getEstagiario () {
		return this.estagiario;
	}
	public ExameFisicoEspecialResponse getExameFisicoEspecial () {
		return this.exameFisicoEspecial;
	}
	public ExameFisicoGeralResponse getExameFisicoGeral () {
		return this.exameFisicoGeral;
	}
	public ParecerResponse getParecer () {
		return this.parecer;
	}
	public MedicoResponse getMedico () {
		return this.medico;
	}
	public List<PrescricaoResponse> getPrescricao () {
		return this.prescricao;
	}
	public List<ExameComplementarResponse> getExameComplementar () {
		return this.exameComplementar;
	}
}
