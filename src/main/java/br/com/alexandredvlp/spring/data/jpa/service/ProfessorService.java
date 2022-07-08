package br.com.alexandredvlp.spring.data.jpa.service;

import br.com.alexandredvlp.spring.data.jpa.entity.Professor;
import br.com.alexandredvlp.spring.data.jpa.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {


    @Autowired
    private ProfessorRepository professorRepository;

    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }

    public Iterable<Professor> findAll() {
        return professorRepository.findAll();
    }

    public Optional<Professor> findById(Long id) {
        return professorRepository.findById(id);
    }

    public Professor update(Professor professor) {
        return professorRepository.save(professor);
    }

    public void delete(Long id) {
        professorRepository.deleteById(id);
    }
}
