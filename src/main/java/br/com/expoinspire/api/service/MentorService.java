package br.com.expoinspire.api.service;

import br.com.expoinspire.api.entity.Mentor;
import br.com.expoinspire.api.repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MentorService {
    @Autowired
    private MentorRepository mentorRepository;

    public List<Mentor> getAll () {
        return mentorRepository.findAll();
    }

    public Optional<Mentor> getById (Long id){
        return mentorRepository.findById(id);
    }

    public Mentor save(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    public void deleteById(Long id) {
        mentorRepository.deleteById(id);
    }

}
