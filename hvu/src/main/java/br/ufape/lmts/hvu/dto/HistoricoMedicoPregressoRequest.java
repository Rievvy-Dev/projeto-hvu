package br.ufape.lmts.hvu.dto;

import java.time.LocalDate;
import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class HistoricoMedicoPregressoRequest  {
	private Boolean vacinacaoFlag;
	private Enum alimentacao;
	private Boolean vermifugacaoFlag;
	private String vermifugacaoProduto;
	private LocalDate vermifugacaoData;
	private LocalDate controleEcotoparasitaFlag;
	private String controleEcotoparasitaProduto;
	private LocalDate controleEcotoparasitaData;
	private List<VacinaRequest> vacina; 


	public HistoricoMedicoPregresso toHistoricoMedicoPregresso() {
		HistoricoMedicoPregresso obj = new HistoricoMedicoPregresso();
		fillHistoricoMedicoPregresso(obj);
		return obj;
	}
	protected void fillHistoricoMedicoPregresso(HistoricoMedicoPregresso obj) {
		obj.setVacinacaoFlag(getVacinacaoFlag());
		obj.setAlimentacao(getAlimentacao());
		obj.setVermifugacaoFlag(getVermifugacaoFlag());
		obj.setVermifugacaoProduto(getVermifugacaoProduto());
		obj.setVermifugacaoData(getVermifugacaoData());
		obj.setControleEcotoparasitaFlag(getControleEcotoparasitaFlag());
		obj.setControleEcotoparasitaProduto(getControleEcotoparasitaProduto());
		obj.setControleEcotoparasitaData(getControleEcotoparasitaData());
		obj.setVacina(getVacina()
			.stream()
			.map(a -> a.toVacina())
			.toList());	
	}

	public HistoricoMedicoPregressoRequest () {
		
	}
	
	public 	Boolean getVacinacaoFlag () {
		return this.vacinacaoFlag;
	}

	public 	Enum getAlimentacao () {
		return this.alimentacao;
	}

	public 	Boolean getVermifugacaoFlag () {
		return this.vermifugacaoFlag;
	}

	public 	String getVermifugacaoProduto () {
		return this.vermifugacaoProduto;
	}

	public 	LocalDate getVermifugacaoData () {
		return this.vermifugacaoData;
	}

	public 	LocalDate getControleEcotoparasitaFlag () {
		return this.controleEcotoparasitaFlag;
	}

	public 	String getControleEcotoparasitaProduto () {
		return this.controleEcotoparasitaProduto;
	}

	public 	LocalDate getControleEcotoparasitaData () {
		return this.controleEcotoparasitaData;
	}

	public List<VacinaRequest> getVacina () {
		return this.vacina;
	}
}
