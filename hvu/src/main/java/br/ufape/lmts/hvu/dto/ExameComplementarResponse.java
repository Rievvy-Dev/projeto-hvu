package br.ufape.lmts.hvu.dto;

import java.time.LocalDate;
import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class ExameComplementarResponse  {
	private LocalDate dataExame;
	private String laudo;
	private Medico responsavel;
	private String arquivo;
	private List<TipoExameResponse> tipoExame; 



	public ExameComplementarResponse(ExameComplementar obj) {
		this.dataExame = obj.getDataExame();
		this.laudo = obj.getLaudo();
		this.responsavel = obj.getResponsavel();
		this.arquivo = obj.getArquivo();
		this.tipoExame = obj.getTipoExame()
			.stream()
			.map(TipoExameResponse::new)
			.toList();	

	}

	
	public 	LocalDate getDataExame () {
		return this.dataExame;
	}

	public 	String getLaudo () {
		return this.laudo;
	}

	public 	Medico getResponsavel () {
		return this.responsavel;
	}

	public 	String getArquivo () {
		return this.arquivo;
	}

	public List<TipoExameResponse> getTipoExame () {
		return this.tipoExame;
	}
}
