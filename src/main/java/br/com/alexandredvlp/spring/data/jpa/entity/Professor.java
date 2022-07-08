package br.com.alexandredvlp.spring.data.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_professores")
public class Professor  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = true, unique = true)//nao pode ser falso e é unico.
    private String prontuario;

    @JsonIgnore
    @OneToMany(mappedBy = "professor")
    private List<Disciplina> disciplinaList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Professor professor = (Professor) o;
        return id != null && Objects.equals(id, professor.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

