package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@MappedSuperclass
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String email;
	private String cpf;
	private String senha;
	private String telefone;
	private String nome;
	@OneToOne(cascade = CascadeType.ALL,
		orphanRemoval = true		
	)
	private Endereco endereco; 

	public Usuario () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	String getEmail () {
		return this.email;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public 	String getCpf () {
		return this.cpf;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public 	String getSenha () {
		return this.senha;
	}
	
	public void setSenha (String senha) {
		this.senha = senha;
	}
	
	public 	String getTelefone () {
		return this.telefone;
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	public 	String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco () {
		return this.endereco;
	}
	
	public void setEndereco (Endereco endereco) {
		this.endereco = endereco;
	}
}