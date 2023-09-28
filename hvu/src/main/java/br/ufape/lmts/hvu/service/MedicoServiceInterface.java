package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.Medico;

public interface MedicoServiceInterface {
	Medico saveMedico(Medico o);
	Medico findMedicoById(long id);
	Medico updateMedico(Medico u);
	void deleteMedico(Medico u);
	void deleteMedico(long id);
	List<Medico> getAllMedico();
    
    

    
}