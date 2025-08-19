package br.com.expoinspire.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.expoinspire.api.model.Turno;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {
}