package br.ufape.lmts.hvu.service;

import java.util.List;

import br.ufape.lmts.hvu.model.Tutor;

public interface TutorServiceInterface {
	Tutor saveTutor(Tutor o);
	Tutor findTutorById(long id);
	Tutor updateTutor(Tutor u);
	void deleteTutor(Tutor u);
	void deleteTutor(long id);
	List<Tutor> getAllTutor();
    
    

    
}