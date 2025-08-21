package br.com.expoinspire.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.expoinspire.api.entity.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
}