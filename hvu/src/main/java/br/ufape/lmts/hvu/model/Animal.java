package br.ufape.lmts.hvu.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Animal  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String sexo;
	private String alergias;
	private LocalDate dataNascimento;
	private String imagem;
	@OneToOne
	private Especie especie; 
	@OneToOne
	private Consulta consulta; 
	@OneToMany
	@JoinColumn(name = "animal_id")
	private List<HistoricoMedicoPregresso> historicoMedicoPregresso; 

	public Animal () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public 	String getSexo () {
		return this.sexo;
	}
	
	public void setSexo (String sexo) {
		this.sexo = sexo;
	}
	
	public 	String getAlergias () {
		return this.alergias;
	}
	
	public void setAlergias (String alergias) {
		this.alergias = alergias;
	}
	
	public LocalDate getDataNascimento () {
		return this.dataNascimento;
	}
	
	public void setDataNascimento (LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public 	String getImagem () {
		return this.imagem;
	}
	
	public void setImagem (String imagem) {
		this.imagem = imagem;
	}
	
	public Especie getEspecie () {
		return this.especie;
	}
	
	public void setEspecie (Especie especie) {
		this.especie = especie;
	}
	public Consulta getConsulta () {
		return this.consulta;
	}
	
	public void setConsulta (Consulta consulta) {
		this.consulta = consulta;
	}
	public  List<HistoricoMedicoPregresso>  getHistoricoMedicoPregresso () {
		return this.historicoMedicoPregresso;
	}
	
	public void setHistoricoMedicoPregresso ( List<HistoricoMedicoPregresso>  historicoMedicoPregresso) {
		this.historicoMedicoPregresso = historicoMedicoPregresso;
	}
}