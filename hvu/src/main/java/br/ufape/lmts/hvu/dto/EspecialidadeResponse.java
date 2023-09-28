package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class EspecialidadeResponse  {
	private String nome;
	private String descricao;
	private List<VagaResponse> vaga; 
	private List<CronogramaResponse> cronograma; 
	private List<MedicoResponse> medico; 



	public EspecialidadeResponse(Especialidade obj) {
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
		this.vaga = obj.getVaga()
			.stream()
			.map(VagaResponse::new)
			.toList();	
		this.cronograma = obj.getCronograma()
			.stream()
			.map(CronogramaResponse::new)
			.toList();	
		this.medico = obj.getMedico()
			.stream()
			.map(MedicoResponse::new)
			.toList();

	}

	
	public 	String getNome () {
		return this.nome;
	}

	public 	String getDescricao () {
		return this.descricao;
	}

	public List<VagaResponse> getVaga () {
		return this.vaga;
	}
	public List<CronogramaResponse> getCronograma () {
		return this.cronograma;
	}
	public List<MedicoResponse> getMedico () {
		return this.medico;
	}
}
