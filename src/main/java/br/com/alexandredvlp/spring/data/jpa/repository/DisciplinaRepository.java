package br.com.alexandredvlp.spring.data.jpa.repository;

import br.com.alexandredvlp.spring.data.jpa.entity.Disciplina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends CrudRepository<Disciplina, Long> {
}
