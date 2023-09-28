package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class EnderecoRequest  {
	private String cep;
	private String rua;
	private String municipio;
	private String cidade;
	private int numero;
	private String bairro;


	public Endereco toEndereco() {
		Endereco obj = new Endereco();
		fillEndereco(obj);
		return obj;
	}
	protected void fillEndereco(Endereco obj) {
		obj.setCep(getCep());
		obj.setRua(getRua());
		obj.setMunicipio(getMunicipio());
		obj.setCidade(getCidade());
		obj.setNumero(getNumero());
		obj.setBairro(getBairro());
	}

	public EnderecoRequest () {
		
	}
	
	public 	String getCep () {
		return this.cep;
	}

	public 	String getRua () {
		return this.rua;
	}

	public 	String getMunicipio () {
		return this.municipio;
	}

	public 	String getCidade () {
		return this.cidade;
	}

	public 	int getNumero () {
		return this.numero;
	}

	public 	String getBairro () {
		return this.bairro;
	}

}
