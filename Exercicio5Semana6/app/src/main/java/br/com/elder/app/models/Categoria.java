package br.com.elder.app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_categoria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

}
