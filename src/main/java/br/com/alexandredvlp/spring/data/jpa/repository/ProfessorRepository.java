package br.com.alexandredvlp.spring.data.jpa.repository;

import br.com.alexandredvlp.spring.data.jpa.entity.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Long> {
}
