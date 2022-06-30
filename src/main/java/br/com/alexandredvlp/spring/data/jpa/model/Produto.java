package br.com.alexandredvlp.spring.data.jpa.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")//Aqui referencia minha fk que é minha coluna na tabela
    private Fornecedor fornecedor;
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Produto produto = (Produto) o;
        return id != null && Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
