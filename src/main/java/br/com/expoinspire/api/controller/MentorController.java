package br.com.expoinspire.api.controller;

import br.com.expoinspire.api.entity.Mentor;
import br.com.expoinspire.api.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// MUDANÇA 1: Ajustado para "/api/mentores" para bater com o SecurityConfig
@RequestMapping("/api/mentores")
public class MentorController {
    @Autowired
    private MentorService mentorService;

    @GetMapping
    public ResponseEntity<List<Mentor>> getAllMentores() {
        return ResponseEntity.ok(mentorService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mentor> getMentorById(@PathVariable Long id) {
        return mentorService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Mentor> createMentor(@RequestBody Mentor mentor) {
        Mentor novoMentor = mentorService.save(mentor);
        return new ResponseEntity<>(novoMentor, HttpStatus.CREATED);
    }

    // MUDANÇA 2: Adicionado as chaves "{}" ao redor do id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMentor(@PathVariable Long id) {
        mentorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}