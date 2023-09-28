package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class TipoExameResponse  {
	private Enum nome;



	public TipoExameResponse(TipoExame obj) {
		this.nome = obj.getNome();

	}

	
	public 	Enum getNome () {
		return this.nome;
	}

}
