package br.com.alexandredvlp.spring.data.jpa.repository;

import br.com.alexandredvlp.spring.data.jpa.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
