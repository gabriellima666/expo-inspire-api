package br.com.expoinspire.api.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "avaliador_turno")
public class AvaliadorTurno {

    @EmbeddedId
    private AvaliadorTurnoId id;

    @ManyToOne
    @MapsId("avaliadorId")
    @JoinColumn(name = "avaliador_id")
    private Avaliador avaliador;

    @ManyToOne
    @MapsId("turnoId")
    @JoinColumn(name = "turno_id")
    private Turno turno;
}