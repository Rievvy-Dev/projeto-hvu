package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.CronogramaRepository;
import br.ufape.lmts.hvu.model.Cronograma;

@Service
public class CronogramaService implements CronogramaServiceInterface {
	@Autowired
	CronogramaRepository repository;

	public CronogramaService(CronogramaRepository repository) {
		this.repository = repository;
	}

	public CronogramaService() {
	}
	
	public CronogramaRepository getRepository() {
		return repository;
	}

	public void setDao(CronogramaRepository repository) {
		this.repository = repository;
	}	

	public Cronograma saveCronograma(Cronograma newInstance) {
		return repository.save(newInstance);
	}

	public Cronograma updateCronograma(Cronograma transientObject) {
		return repository.save(transientObject);
	}

	public Cronograma findCronogramaById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Cronograma with id = " + id));
	}

	public List<Cronograma> getAllCronograma(){
		return repository.findAll();
	}

	public void deleteCronograma(Cronograma persistentObject){
		this.deleteCronograma(persistentObject.getId());
		
	}
	
	public void deleteCronograma(long id){
		Cronograma obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Cronograma with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}