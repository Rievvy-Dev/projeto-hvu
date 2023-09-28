package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class ExameComplementarRequest  {
	private LocalDate dataExame;
	private String laudo;
	private Medico responsavel;
	private String arquivo;
	private List<TipoExameRequest> tipoExame; 


	public ExameComplementar toExameComplementar() {
		ExameComplementar obj = new ExameComplementar();
		fillExameComplementar(obj);
		return obj;
	}
	protected void fillExameComplementar(ExameComplementar obj) {
		obj.setDataExame(getDataExame());
		obj.setLaudo(getLaudo());
		obj.setResponsavel(getResponsavel());
		obj.setArquivo(getArquivo());
		obj.setTipoExame(getTipoExame()
			.stream()
			.map(a -> a.toTipoExame())
			.toList());	
	}

	public ExameComplementarRequest () {
		
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

	public List<TipoExameRequest> getTipoExame () {
		return this.tipoExame;
	}
}
