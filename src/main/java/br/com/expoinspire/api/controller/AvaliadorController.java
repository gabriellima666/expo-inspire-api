package br.com.expoinspire.api.controller;

import br.com.expoinspire.api.entity.Avaliador;
import br.com.expoinspire.api.service.AvaliadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/avaliadores")
public class AvaliadorController {
    @Autowired
    private AvaliadorService avaliadorService;

    @GetMapping
    public ResponseEntity<List<Avaliador>> getAllAvaliadores(){
        List<Avaliador> avaliadores = avaliadorService.getAll();
        return ResponseEntity.ok(avaliadores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Avaliador> getAvaliadorById(@PathVariable Long id) {
        return avaliadorService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Avaliador> createAvaliador(@RequestBody Avaliador avaliador) {
        Avaliador novoAvaliador = avaliadorService.save(avaliador);
        return new ResponseEntity<>(novoAvaliador, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAvaliador(@PathVariable Long id) {
        avaliadorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
