package br.com.expoinspire.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.expoinspire.api.model.Avaliador;

@Repository
public interface AvaliadorRepository extends JpaRepository<Avaliador, Long> {
    Optional<Avaliador> findByCodigoAcesso(String codigoAcesso);
}