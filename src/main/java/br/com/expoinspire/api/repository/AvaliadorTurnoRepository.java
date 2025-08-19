package br.com.expoinspire.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.expoinspire.api.model.AvaliadorTurno;
import br.com.expoinspire.api.model.AvaliadorTurnoId;

@Repository
public interface AvaliadorTurnoRepository extends JpaRepository<AvaliadorTurno, AvaliadorTurnoId> {
}