package br.com.alexandredvlp.spring.data.jpa.repository;

import br.com.alexandredvlp.spring.data.jpa.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor,Long> {
}
