package br.com.expoinspire.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "eixos")
public class Eixo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
}
