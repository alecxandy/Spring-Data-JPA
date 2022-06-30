package br.com.alexandredvlp.spring.data.jpa.service;

import br.com.alexandredvlp.spring.data.jpa.model.Fornecedor;
import br.com.alexandredvlp.spring.data.jpa.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }

    //O optional não tra objetos null, se por um acaso não estiver valor ele trás empty
    public Optional<Fornecedor> findById(Long id) {
        return fornecedorRepository.findById(id);
    }

    public Fornecedor save(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor update(Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }
    public void delete(Long id) {
        fornecedorRepository.deleteById(id);
    }
}
