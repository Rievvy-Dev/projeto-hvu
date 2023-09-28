package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class MedicoResponse extends UsuarioResponse {
	private String crmv;



	public MedicoResponse(Medico obj) {
		super(obj);		
		this.crmv = obj.getCrmv();

	}

	
	public 	String getCrmv () {
		return this.crmv;
	}

}
