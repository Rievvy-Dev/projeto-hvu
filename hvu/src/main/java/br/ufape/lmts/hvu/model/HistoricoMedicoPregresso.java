package br.ufape.lmts.hvu.model;

import java.time.LocalDate;
import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class HistoricoMedicoPregresso  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Boolean vacinacaoFlag;
	private Enum alimentacao;
	private Boolean vermifugacaoFlag;
	private String vermifugacaoProduto;
	private LocalDate vermifugacaoData;
	private LocalDate controleEcotoparasitaFlag;
	private String controleEcotoparasitaProduto;
	private LocalDate controleEcotoparasitaData;
	@OneToMany
	@JoinColumn(name = "historicoMedicoPregresso_id")
	private List<Vacina> vacina; 

	public HistoricoMedicoPregresso () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	Boolean getVacinacaoFlag () {
		return this.vacinacaoFlag;
	}
	
	public void setVacinacaoFlag (Boolean vacinacaoFlag) {
		this.vacinacaoFlag = vacinacaoFlag;
	}
	
	public 	Enum getAlimentacao () {
		return this.alimentacao;
	}
	
	public void setAlimentacao (Enum alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	public 	Boolean getVermifugacaoFlag () {
		return this.vermifugacaoFlag;
	}
	
	public void setVermifugacaoFlag (Boolean vermifugacaoFlag) {
		this.vermifugacaoFlag = vermifugacaoFlag;
	}
	
	public 	String getVermifugacaoProduto () {
		return this.vermifugacaoProduto;
	}
	
	public void setVermifugacaoProduto (String vermifugacaoProduto) {
		this.vermifugacaoProduto = vermifugacaoProduto;
	}
	
	public 	LocalDate getVermifugacaoData () {
		return this.vermifugacaoData;
	}
	
	public void setVermifugacaoData (LocalDate vermifugacaoData) {
		this.vermifugacaoData = vermifugacaoData;
	}
	
	public 	LocalDate getControleEcotoparasitaFlag () {
		return this.controleEcotoparasitaFlag;
	}
	
	public void setControleEcotoparasitaFlag (LocalDate controleEcotoparasitaFlag) {
		this.controleEcotoparasitaFlag = controleEcotoparasitaFlag;
	}
	
	public 	String getControleEcotoparasitaProduto () {
		return this.controleEcotoparasitaProduto;
	}
	
	public void setControleEcotoparasitaProduto (String controleEcotoparasitaProduto) {
		this.controleEcotoparasitaProduto = controleEcotoparasitaProduto;
	}
	
	public 	LocalDate getControleEcotoparasitaData () {
		return this.controleEcotoparasitaData;
	}
	
	public void setControleEcotoparasitaData (LocalDate controleEcotoparasitaData) {
		this.controleEcotoparasitaData = controleEcotoparasitaData;
	}
	
	public  List<Vacina>  getVacina () {
		return this.vacina;
	}
	
	public void setVacina ( List<Vacina>  vacina) {
		this.vacina = vacina;
	}
}