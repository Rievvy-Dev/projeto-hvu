package br.ufape.lmts.hvu.dto;

import br.ufape.lmts.hvu.model.Animal;

import java.time.LocalDate;
import java.util.List;


public  class AnimalRequest  {
	private String nome;
	private String sexo;
	private String alergias;
	private LocalDate dataNascimento;
	private String imagem;
	private EspecieRequest especie; 
	private ConsultaRequest consulta; 
	private List<HistoricoMedicoPregressoRequest> historicoMedicoPregresso; 


	public Animal toAnimal() {
		Animal obj = new Animal();
		fillAnimal(obj);
		return obj;
	}
	protected void fillAnimal(Animal obj) {
		obj.setNome(getNome());
		obj.setSexo(getSexo());
		obj.setAlergias(getAlergias());
		obj.setDataNascimento(getDataNascimento());
		obj.setImagem(getImagem());
		obj.setEspecie(getEspecie().toEspecie());	
		obj.setConsulta(getConsulta().toConsulta());	
		obj.setHistoricoMedicoPregresso(getHistoricoMedicoPregresso()
			.stream()
			.map(a -> a.toHistoricoMedicoPregresso())
			.toList());	
	}

	public AnimalRequest () {
		
	}
	
	public 	String getNome () {
		return this.nome;
	}

	public 	String getSexo () {
		return this.sexo;
	}

	public 	String getAlergias () {
		return this.alergias;
	}

	public 	LocalDate getDataNascimento () {
		return this.dataNascimento;
	}

	public 	String getImagem () {
		return this.imagem;
	}

	public EspecieRequest getEspecie () {
		return this.especie;
	}
	public ConsultaRequest getConsulta () {
		return this.consulta;
	}
	public List<HistoricoMedicoPregressoRequest> getHistoricoMedicoPregresso () {
		return this.historicoMedicoPregresso;
	}
}
