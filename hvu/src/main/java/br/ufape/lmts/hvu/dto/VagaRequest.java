package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class VagaRequest  {
	private LocalDateTime dataHora;
	private Enum tipoAgendamento;


	public Vaga toVaga() {
		Vaga obj = new Vaga();
		fillVaga(obj);
		return obj;
	}
	protected void fillVaga(Vaga obj) {
		obj.setDataHora(getDataHora());
		obj.setTipoAgendamento(getTipoAgendamento());
	}

	public VagaRequest () {
		
	}
	
	public 	LocalDateTime getDataHora () {
		return this.dataHora;
	}

	public 	Enum getTipoAgendamento () {
		return this.tipoAgendamento;
	}

}
