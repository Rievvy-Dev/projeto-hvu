package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Consulta  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Double pesoAtual;
	private float idade;
	private String queixa;
	private Enum tipoConsulta;
	private String alteracoesClinicasDiversas;
	private String suspeitasClinicas;
	@OneToOne
	private Vaga vaga; 
	@OneToOne
	private Estagiario estagiario; 
	@OneToOne
	private ExameFisicoEspecial exameFisicoEspecial; 
	@OneToOne
	private ExameFisicoGeral exameFisicoGeral; 
	@OneToOne
	private Parecer parecer; 
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medico_id")
	private Medico medico; 
	@OneToMany
	@JoinColumn(name = "consulta_id")
	private List<Prescricao> prescricao; 
	@OneToMany
	@JoinColumn(name = "consulta_id")
	private List<ExameComplementar> exameComplementar; 

	public Consulta () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	Double getPesoAtual () {
		return this.pesoAtual;
	}
	
	public void setPesoAtual (Double pesoAtual) {
		this.pesoAtual = pesoAtual;
	}
	
	public 	float getIdade () {
		return this.idade;
	}
	
	public void setIdade (float idade) {
		this.idade = idade;
	}
	
	public 	String getQueixa () {
		return this.queixa;
	}
	
	public void setQueixa (String queixa) {
		this.queixa = queixa;
	}
	
	public 	Enum getTipoConsulta () {
		return this.tipoConsulta;
	}
	
	public void setTipoConsulta (Enum tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
	
	public 	String getAlteracoesClinicasDiversas () {
		return this.alteracoesClinicasDiversas;
	}
	
	public void setAlteracoesClinicasDiversas (String alteracoesClinicasDiversas) {
		this.alteracoesClinicasDiversas = alteracoesClinicasDiversas;
	}
	
	public 	String getSuspeitasClinicas () {
		return this.suspeitasClinicas;
	}
	
	public void setSuspeitasClinicas (String suspeitasClinicas) {
		this.suspeitasClinicas = suspeitasClinicas;
	}
	
	public Vaga getVaga () {
		return this.vaga;
	}
	
	public void setVaga (Vaga vaga) {
		this.vaga = vaga;
	}
	public Estagiario getEstagiario () {
		return this.estagiario;
	}
	
	public void setEstagiario (Estagiario estagiario) {
		this.estagiario = estagiario;
	}
	public ExameFisicoEspecial getExameFisicoEspecial () {
		return this.exameFisicoEspecial;
	}
	
	public void setExameFisicoEspecial (ExameFisicoEspecial exameFisicoEspecial) {
		this.exameFisicoEspecial = exameFisicoEspecial;
	}
	public ExameFisicoGeral getExameFisicoGeral () {
		return this.exameFisicoGeral;
	}
	
	public void setExameFisicoGeral (ExameFisicoGeral exameFisicoGeral) {
		this.exameFisicoGeral = exameFisicoGeral;
	}
	public Parecer getParecer () {
		return this.parecer;
	}
	
	public void setParecer (Parecer parecer) {
		this.parecer = parecer;
	}
	public Medico getMedico () {
		return this.medico;
	}
	
	public void setMedico (Medico medico) {
		this.medico = medico;
	}
	public  List<Prescricao>  getPrescricao () {
		return this.prescricao;
	}
	
	public void setPrescricao ( List<Prescricao>  prescricao) {
		this.prescricao = prescricao;
	}
	public  List<ExameComplementar>  getExameComplementar () {
		return this.exameComplementar;
	}
	
	public void setExameComplementar ( List<ExameComplementar>  exameComplementar) {
		this.exameComplementar = exameComplementar;
	}
}