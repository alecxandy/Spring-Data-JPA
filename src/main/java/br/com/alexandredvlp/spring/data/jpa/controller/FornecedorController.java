package br.com.alexandredvlp.spring.data.jpa.controller;

import br.com.alexandredvlp.spring.data.jpa.model.Fornecedor;
import br.com.alexandredvlp.spring.data.jpa.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.awt.*;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping("/listar")
    public ResponseEntity<List<Fornecedor>> findAll() {
        List<Fornecedor> fornecedorList = fornecedorService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(fornecedorList);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Optional<Fornecedor>> findById(@PathVariable Long id) {
        Optional<Fornecedor> fornecedor = fornecedorService.findById(id);
        return ResponseEntity.ok().body(fornecedor);
    }

    @PostMapping("/save")
    public ResponseEntity<Fornecedor> save(@RequestBody Fornecedor fornecedor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedorService.save(fornecedor));
    }

    @PutMapping("/update")
    public ResponseEntity<Fornecedor> update(@RequestBody Fornecedor fornecedor) {
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        fornecedorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
