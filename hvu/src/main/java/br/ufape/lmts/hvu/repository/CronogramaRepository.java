package br.ufape.lmts.hvu.repository;

import java.util.List;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ufape.lmts.hvu.model.Cronograma;

@Repository
public interface CronogramaRepository extends JpaRepository<Cronograma, Long> {

	

}