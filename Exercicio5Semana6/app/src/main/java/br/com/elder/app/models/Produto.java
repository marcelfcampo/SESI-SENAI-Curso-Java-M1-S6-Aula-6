package br.com.elder.app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_produto")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;


}


