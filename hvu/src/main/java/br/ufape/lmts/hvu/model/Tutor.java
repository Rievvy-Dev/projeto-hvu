package br.ufape.lmts.hvu.model;

import java.util.*;
import jakarta.persistence.*;
import java.math.*;


@Entity
public  class Tutor extends Usuario {
	private String rg;
	@OneToMany
	@JoinColumn(name = "tutor_id")
	private List<Animal> animal; 

	public Tutor () {
		super();
	}
	
	public 	String getRg () {
		return this.rg;
	}
	
	public void setRg (String rg) {
		this.rg = rg;
	}
	
	public  List<Animal>  getAnimal () {
		return this.animal;
	}
	
	public void setAnimal ( List<Animal>  animal) {
		this.animal = animal;
	}
}