package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class MedicoRequest extends UsuarioRequest {
	private String crmv;


	public Medico toMedico() {
		Medico obj = new Medico();
		fillMedico(obj);
		return obj;
	}
	protected void fillMedico(Medico obj) {
		this.fillUsuario(obj);		
		obj.setCrmv(getCrmv());
	}

	public MedicoRequest () {
		
	}
	
	public 	String getCrmv () {
		return this.crmv;
	}

}
