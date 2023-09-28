package br.ufape.lmts.hvu.model;

import java.time.LocalDateTime;
import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Vaga  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDateTime dataHora;
	private Enum tipoAgendamento;

	public Vaga () {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public 	LocalDateTime getDataHora () {
		return this.dataHora;
	}
	
	public void setDataHora (LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	
	public 	Enum getTipoAgendamento () {
		return this.tipoAgendamento;
	}
	
	public void setTipoAgendamento (Enum tipoAgendamento) {
		this.tipoAgendamento = tipoAgendamento;
	}
	
}