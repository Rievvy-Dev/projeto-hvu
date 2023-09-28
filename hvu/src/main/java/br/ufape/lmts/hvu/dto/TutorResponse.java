package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class TutorResponse extends UsuarioResponse {
	private String rg;
	private List<AnimalResponse> animal; 



	public TutorResponse(Tutor obj) {
		super(obj);		
		this.rg = obj.getRg();
		this.animal = obj.getAnimal()
			.stream()
			.map(AnimalResponse::new)
			.toList();	

	}

	
	public 	String getRg () {
		return this.rg;
	}

	public List<AnimalResponse> getAnimal () {
		return this.animal;
	}
}
