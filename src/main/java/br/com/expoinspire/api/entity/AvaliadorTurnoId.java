package br.com.expoinspire.api.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AvaliadorTurnoId implements Serializable {

    @Column(name = "avaliador_id")
    private Long avaliadorId;

    @Column(name = "turno_id")
    private Long turnoId;
}