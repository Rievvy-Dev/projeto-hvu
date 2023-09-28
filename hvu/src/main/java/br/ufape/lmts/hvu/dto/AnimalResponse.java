package br.ufape.lmts.hvu.dto;

import java.time.LocalDate;
import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class AnimalResponse  {
	private String nome;
	private String sexo;
	private String alergias;
	private LocalDate dataNascimento;
	private String imagem;
	private EspecieResponse especie; 
	private ConsultaResponse consulta; 
	private List<HistoricoMedicoPregressoResponse> historicoMedicoPregresso; 



	public AnimalResponse(Animal obj) {
		this.nome = obj.getNome();
		this.sexo = obj.getSexo();
		this.alergias = obj.getAlergias();
		this.dataNascimento = obj.getDataNascimento();
		this.imagem = obj.getImagem();
		this.especie = new EspecieResponse(obj.getEspecie());
		this.consulta = new ConsultaResponse(obj.getConsulta());
		this.historicoMedicoPregresso = obj.getHistoricoMedicoPregresso()
			.stream()
			.map(HistoricoMedicoPregressoResponse::new)
			.toList();	

	}

	
	public 	String getNome () {
		return this.nome;
	}

	public 	String getSexo () {
		return this.sexo;
	}

	public 	String getAlergias () {
		return this.alergias;
	}

	public 	LocalDate getDataNascimento () {
		return this.dataNascimento;
	}

	public 	String getImagem () {
		return this.imagem;
	}

	public EspecieResponse getEspecie () {
		return this.especie;
	}
	public ConsultaResponse getConsulta () {
		return this.consulta;
	}
	public List<HistoricoMedicoPregressoResponse> getHistoricoMedicoPregresso () {
		return this.historicoMedicoPregresso;
	}
}
