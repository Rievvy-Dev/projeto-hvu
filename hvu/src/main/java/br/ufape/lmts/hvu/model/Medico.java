package br.ufape.lmts.hvu.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public  class Medico extends Usuario {
	@Column
	private String crmv;

	public Medico () {
		super();
	}
	
	public 	String getCrmv () {
		return this.crmv;
	}
	
	public void setCrmv (String crmv) {
		this.crmv = crmv;
	}
	
}