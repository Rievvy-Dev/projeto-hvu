package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Endereco  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cep;
	private String rua;
	private String municipio;
	private String cidade;
	private int numero;
	private String bairro;

	public Endereco () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	String getCep () {
		return this.cep;
	}
	
	public void setCep (String cep) {
		this.cep = cep;
	}
	
	public 	String getRua () {
		return this.rua;
	}
	
	public void setRua (String rua) {
		this.rua = rua;
	}
	
	public 	String getMunicipio () {
		return this.municipio;
	}
	
	public void setMunicipio (String municipio) {
		this.municipio = municipio;
	}
	
	public 	String getCidade () {
		return this.cidade;
	}
	
	public void setCidade (String cidade) {
		this.cidade = cidade;
	}
	
	public 	int getNumero () {
		return this.numero;
	}
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public 	String getBairro () {
		return this.bairro;
	}
	
	public void setBairro (String bairro) {
		this.bairro = bairro;
	}
	
}