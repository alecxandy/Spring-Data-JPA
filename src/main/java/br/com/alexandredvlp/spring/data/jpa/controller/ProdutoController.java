package br.com.alexandredvlp.spring.data.jpa.controller;


import br.com.alexandredvlp.spring.data.jpa.model.Produto;
import br.com.alexandredvlp.spring.data.jpa.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Produto>> findAll() {
        return ResponseEntity.ok().body(produtoService.findAll());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Optional<Produto>> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(produtoService.findByid(id));
    }

    @PostMapping("/save")
    public ResponseEntity<Produto> save(@RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.save(produto));
    }

    @PutMapping("/update")
    public ResponseEntity<Produto> update(@RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.save(produto));
    }

    public ResponseEntity<?> delete(@PathVariable Long id) {
        produtoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
