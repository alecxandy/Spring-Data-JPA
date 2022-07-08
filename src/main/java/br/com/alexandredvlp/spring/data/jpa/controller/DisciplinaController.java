package br.com.alexandredvlp.spring.data.jpa.controller;

import br.com.alexandredvlp.spring.data.jpa.entity.Disciplina;
import br.com.alexandredvlp.spring.data.jpa.entity.Professor;
import br.com.alexandredvlp.spring.data.jpa.service.DisciplinaService;
import br.com.alexandredvlp.spring.data.jpa.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @Autowired
    private ProfessorService professorService;


    @GetMapping("/listar")
    public ResponseEntity<Iterable<Disciplina>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(disciplinaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Disciplina>> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(disciplinaService.findById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<Disciplina> save(@RequestBody Disciplina disciplina) {
        return ResponseEntity.status(HttpStatus.CREATED).body(disciplinaService.save(disciplina));
    }



    @PostMapping("/update")
    public ResponseEntity<Disciplina> update(@RequestBody Disciplina disciplina) {
        Optional<Disciplina> optionalDisciplina = disciplinaService.findById(disciplina.getId());
        if (optionalDisciplina.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(disciplinaService.update(disciplina));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(disciplina);
        }
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> delete(@RequestBody Disciplina disciplina) {
        return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso!!");
    }

}
