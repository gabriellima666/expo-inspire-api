package br.com.expoinspire.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.expoinspire.api.model.Rubrica;

@Repository
public interface RubricaRepository extends JpaRepository<Rubrica, Long> {
}