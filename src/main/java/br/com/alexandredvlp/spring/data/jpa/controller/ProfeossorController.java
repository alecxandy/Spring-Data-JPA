package br.com.alexandredvlp.spring.data.jpa.controller;

import br.com.alexandredvlp.spring.data.jpa.entity.Professor;
import br.com.alexandredvlp.spring.data.jpa.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/professor")
public class ProfeossorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping("/listar")
    public ResponseEntity<Iterable<Professor>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(professorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Professor>> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(professorService.findById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<Professor> save(@RequestBody Professor professor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(professorService.save(professor));
    }

    @PostMapping("/update")
    public ResponseEntity<Professor> update(@RequestBody Professor professor) {
        Optional<Professor> optionalProfessor = professorService.findById(professor.getId());
        if (optionalProfessor.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(professorService.update(professor));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(professor);
        }
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> delete(@RequestBody Professor professor) {
        return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso!!");
    }


}
