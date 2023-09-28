package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class EnderecoResponse  {
	private String cep;
	private String rua;
	private String municipio;
	private String cidade;
	private int numero;
	private String bairro;



	public EnderecoResponse(Endereco obj) {
		this.cep = obj.getCep();
		this.rua = obj.getRua();
		this.municipio = obj.getMunicipio();
		this.cidade = obj.getCidade();
		this.numero = obj.getNumero();
		this.bairro = obj.getBairro();

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
