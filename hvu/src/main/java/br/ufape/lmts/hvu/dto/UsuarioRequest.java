package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public class UsuarioRequest  {
	private String email;
	private String cpf;
	private String senha;
	private String telefone;
	private String nome;
	private EnderecoRequest endereco; 


	public Usuario toUsuario() {
		Usuario obj = new Usuario();
		fillUsuario(obj);
		return obj;
	}
	protected void fillUsuario(Usuario obj) {
		obj.setEmail(getEmail());
		obj.setCpf(getCpf());
		obj.setSenha(getSenha());
		obj.setTelefone(getTelefone());
		obj.setNome(getNome());
		obj.setEndereco(getEndereco().toEndereco());	
	}

	public UsuarioRequest () {
		
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

	public EnderecoRequest getEndereco () {
		return this.endereco;
	}
}
