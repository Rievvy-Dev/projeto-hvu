package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class UsuarioResponse  {
	private String email;
	private String cpf;
	private String senha;
	private String telefone;
	private String nome;
	private EnderecoResponse endereco; 



	public UsuarioResponse(Usuario obj) {
		this.email = obj.getEmail();
		this.cpf = obj.getCpf();
		this.senha = obj.getSenha();
		this.telefone = obj.getTelefone();
		this.nome = obj.getNome();
		this.endereco = new EnderecoResponse(obj.getEndereco());

	}

	
	public 	String getEmail () {
		return this.email;
	}

	public 	String getCpf () {
		return this.cpf;
	}

	public 	String getSenha () {
		return this.senha;
	}

	public 	String getTelefone () {
		return this.telefone;
	}

	public 	String getNome () {
		return this.nome;
	}

	public EnderecoResponse getEndereco () {
		return this.endereco;
	}
}
