package br.com.alexandredvlp.spring.data.jpa.service;

import br.com.alexandredvlp.spring.data.jpa.entity.Disciplina;
import br.com.alexandredvlp.spring.data.jpa.entity.Professor;
import br.com.alexandredvlp.spring.data.jpa.repository.DisciplinaRepository;
import br.com.alexandredvlp.spring.data.jpa.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DisciplinaService {


    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public Disciplina save(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public Iterable<Disciplina> findAll() {
        return disciplinaRepository.findAll();
    }

    public Optional<Disciplina> findById(Long id) {
        return disciplinaRepository.findById(id);
    }

    public Disciplina update(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public void delete(Long id) {
        disciplinaRepository.deleteById(id);

    }
}