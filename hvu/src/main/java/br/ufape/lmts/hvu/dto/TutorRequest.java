package br.ufape.lmts.hvu.dto;

import java.util.*;
import java.math.*;
import br.ufape.lmts.hvu.model.*;


public  class TutorRequest extends UsuarioRequest {
	private String rg;
	private List<AnimalRequest> animal; 


	public Tutor toTutor() {
		Tutor obj = new Tutor();
		fillTutor(obj);
		return obj;
	}
	protected void fillTutor(Tutor obj) {
		this.fillUsuario(obj);		
		obj.setRg(getRg());
		obj.setAnimal(getAnimal()
			.stream()
			.map(a -> a.toAnimal())
			.toList());	
	}

	public TutorRequest () {
		
	}
	
	public 	String getRg () {
		return this.rg;
	}

	public List<AnimalRequest> getAnimal () {
		return this.animal;
	}
}
