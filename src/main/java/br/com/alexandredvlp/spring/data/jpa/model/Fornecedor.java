package br.com.alexandredvlp.spring.data.jpa.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "fornecedor")//mapeamento onde relaciona esta entity com a outra
    private List<Produto> produtoList = new ArrayList<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Fornecedor fornecedor = (Fornecedor) o;
        return id != null && Objects.equals(id, fornecedor.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
