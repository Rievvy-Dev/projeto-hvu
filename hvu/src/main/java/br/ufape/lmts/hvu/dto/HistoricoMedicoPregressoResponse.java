package br.ufape.lmts.hvu.dto;

import java.time.LocalDate;
import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class HistoricoMedicoPregressoResponse  {
	private Boolean vacinacaoFlag;
	private Enum alimentacao;
	private Boolean vermifugacaoFlag;
	private String vermifugacaoProduto;
	private LocalDate vermifugacaoData;
	private LocalDate controleEcotoparasitaFlag;
	private String controleEcotoparasitaProduto;
	private LocalDate controleEcotoparasitaData;
	private List<VacinaResponse> vacina; 



	public HistoricoMedicoPregressoResponse(HistoricoMedicoPregresso obj) {
		this.vacinacaoFlag = obj.getVacinacaoFlag();
		this.alimentacao = obj.getAlimentacao();
		this.vermifugacaoFlag = obj.getVermifugacaoFlag();
		this.vermifugacaoProduto = obj.getVermifugacaoProduto();
		this.vermifugacaoData = obj.getVermifugacaoData();
		this.controleEcotoparasitaFlag = obj.getControleEcotoparasitaFlag();
		this.controleEcotoparasitaProduto = obj.getControleEcotoparasitaProduto();
		this.controleEcotoparasitaData = obj.getControleEcotoparasitaData();
		this.vacina = obj.getVacina()
			.stream()
			.map(VacinaResponse::new)
			.toList();	

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

	public List<VacinaResponse> getVacina () {
		return this.vacina;
	}
}
