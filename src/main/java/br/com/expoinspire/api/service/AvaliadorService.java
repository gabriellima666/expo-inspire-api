package br.com.expoinspire.api.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.expoinspire.api.entity.Avaliador;
import br.com.expoinspire.api.repository.AvaliadorRepository;

@Service
public class AvaliadorService {

    @Autowired
    private AvaliadorRepository avaliadorRepository;

    public List<Avaliador> getAll() {
        return avaliadorRepository.findAll();
    }

    public Optional<Avaliador> getById(Long id) {
        return avaliadorRepository.findById(id);
    }

    public Avaliador save(Avaliador avaliador) {
        // Regra de negócio: Gerar um código de acesso único antes de salvar
        avaliador.setCodigoAcesso(generateUniqueCodigo());
        return avaliadorRepository.save(avaliador);
    }

    public void deleteById(Long id) {
        avaliadorRepository.deleteById(id);
    }

    // Método auxiliar privado para nossa regra de negócio
    private String generateUniqueCodigo() {
        Random random = new Random();
        String codigo;
        do {
            int numero = 100000 + random.nextInt(900000); // Gera um número entre 100000 e 999999
            codigo = String.valueOf(numero);
        } while (avaliadorRepository.findByCodigoAcesso(codigo).isPresent()); // Repete se o código já existir

        return codigo;
    }
}