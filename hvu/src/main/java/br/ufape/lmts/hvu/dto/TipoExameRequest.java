package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class TipoExameRequest  {
	private Enum nome;


	public TipoExame toTipoExame() {
		TipoExame obj = new TipoExame();
		fillTipoExame(obj);
		return obj;
	}
	protected void fillTipoExame(TipoExame obj) {
		obj.setNome(getNome());
	}

	public TipoExameRequest () {
		
	}
	
	public 	Enum getNome () {
		return this.nome;
	}

}
