package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class VagaResponse  {
	private LocalDateTime dataHora;
	private Enum tipoAgendamento;



	public VagaResponse(Vaga obj) {
		this.dataHora = obj.getDataHora();
		this.tipoAgendamento = obj.getTipoAgendamento();

	}

	
	public 	LocalDateTime getDataHora () {
		return this.dataHora;
	}

	public 	Enum getTipoAgendamento () {
		return this.tipoAgendamento;
	}

}
