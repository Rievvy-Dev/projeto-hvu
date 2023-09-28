package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
public  class Medico extends Usuario {
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