package br.ufape.lmts.hvu.model;

import java.io.Serializable;
import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Table(name = "Usuario")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
//@MappedSuperclass
public class Usuario implements Serializable {
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

//	public Usuario(String email, String cpf, String senha, String telefone, String nome, Endereco endereco) {
//		this.email = email;
//		this.cpf = cpf;
//		this.senha = senha;
//		this.telefone = telefone;
//		this.nome = nome;
//		this.endereco = endereco;
//	}

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