package br.com.expoinspire.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.expoinspire.api.model.Mentor;

@Repository
public interface MentorRepository extends JpaRepository<Mentor, Long> {
}