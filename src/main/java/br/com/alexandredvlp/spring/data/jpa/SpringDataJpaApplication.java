package br.com.alexandredvlp.spring.data.jpa;

import br.com.alexandredvlp.spring.data.jpa.repository.ProdutoRepository;
import br.com.alexandredvlp.spring.data.jpa.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);

    }

}
