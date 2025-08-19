package br.com.expoinspire.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "rubricas")
public class Rubrica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String criterio;

    @Column(name = "desc_excelente")
    private String descExcelente;

    @Column(name = "desc_muito_bom")
    private String descMuitoBom;

    @Column(name = "desc_bom")
    private String descBom;

    @Column(name = "desc_a_melhorar")
    private String descAMelhorar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eixo_id")
    private Eixo eixo;
}