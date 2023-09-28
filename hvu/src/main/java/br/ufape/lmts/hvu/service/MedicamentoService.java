package br.ufape.lmts.hvu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ufape.lmts.hvu.repository.MedicamentoRepository;
import br.ufape.lmts.hvu.model.Medicamento;

@Service
public class MedicamentoService implements MedicamentoServiceInterface {
	@Autowired
	MedicamentoRepository repository;

	public MedicamentoService(MedicamentoRepository repository) {
		this.repository = repository;
	}

	public MedicamentoService() {
	}
	
	public MedicamentoRepository getRepository() {
		return repository;
	}

	public void setDao(MedicamentoRepository repository) {
		this.repository = repository;
	}	

	public Medicamento saveMedicamento(Medicamento newInstance) {
		return repository.save(newInstance);
	}

	public Medicamento updateMedicamento(Medicamento transientObject) {
		return repository.save(transientObject);
	}

	public Medicamento findMedicamentoById(long id) {
		return repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Medicamento with id = " + id));
	}

	public List<Medicamento> getAllMedicamento(){
		return repository.findAll();
	}

	public void deleteMedicamento(Medicamento persistentObject){
		this.deleteMedicamento(persistentObject.getId());
		
	}
	
	public void deleteMedicamento(long id){
		Medicamento obj = repository.findById(id).orElseThrow( () -> new RuntimeException("It doesn't exist Medicamento with id = " + id));
		repository.delete(obj);
	}	
	
	
	
}