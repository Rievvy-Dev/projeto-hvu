package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.Medicamento;

public interface MedicamentoServiceInterface {
	Medicamento saveMedicamento(Medicamento o);
	Medicamento findMedicamentoById(long id);
	Medicamento updateMedicamento(Medicamento u);
	void deleteMedicamento(Medicamento u);
	void deleteMedicamento(long id);
	List<Medicamento> getAllMedicamento();
    
    

    
}