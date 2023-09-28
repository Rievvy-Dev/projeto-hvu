package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class EspecialidadeRequest  {
	private String nome;
	private String descricao;
	private List<VagaRequest> vaga; 
	private List<CronogramaRequest> cronograma; 
	private List<MedicoRequest> medico; 


	public Especialidade toEspecialidade() {
		Especialidade obj = new Especialidade();
		fillEspecialidade(obj);
		return obj;
	}
	protected void fillEspecialidade(Especialidade obj) {
		obj.setNome(getNome());
		obj.setDescricao(getDescricao());
		obj.setVaga(getVaga()
			.stream()
			.map(a -> a.toVaga())
			.toList());	
		obj.setCronograma(getCronograma()
			.stream()
			.map(a -> a.toCronograma())
			.toList());	
		obj.setMedico(getMedico()
			.stream()
			.map(a -> a.toMedico())
			.toList());	
	}

	public EspecialidadeRequest () {
		
	}
	
	public 	String getNome () {
		return this.nome;
	}

	public 	String getDescricao () {
		return this.descricao;
	}

	public List<VagaRequest> getVaga () {
		return this.vaga;
	}
	public List<CronogramaRequest> getCronograma () {
		return this.cronograma;
	}
	public List<MedicoRequest> getMedico () {
		return this.medico;
	}
}
