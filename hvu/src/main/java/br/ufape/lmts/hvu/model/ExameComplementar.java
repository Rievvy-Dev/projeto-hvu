package br.ufape.lmts.hvu.model;

import java.time.LocalDate;
import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class ExameComplementar  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDate dataExame;
	private String laudo;
	private Medico responsavel;
	private String arquivo;
	@OneToMany
	@JoinColumn(name = "exameComplementar_id")
	private List<TipoExame> tipoExame; 

	public ExameComplementar () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	LocalDate getDataExame () {
		return this.dataExame;
	}
	
	public void setDataExame (LocalDate dataExame) {
		this.dataExame = dataExame;
	}
	
	public 	String getLaudo () {
		return this.laudo;
	}
	
	public void setLaudo (String laudo) {
		this.laudo = laudo;
	}
	
	public 	Medico getResponsavel () {
		return this.responsavel;
	}
	
	public void setResponsavel (Medico responsavel) {
		this.responsavel = responsavel;
	}
	
	public 	String getArquivo () {
		return this.arquivo;
	}
	
	public void setArquivo (String arquivo) {
		this.arquivo = arquivo;
	}
	
	public  List<TipoExame>  getTipoExame () {
		return this.tipoExame;
	}
	
	public void setTipoExame ( List<TipoExame>  tipoExame) {
		this.tipoExame = tipoExame;
	}
}