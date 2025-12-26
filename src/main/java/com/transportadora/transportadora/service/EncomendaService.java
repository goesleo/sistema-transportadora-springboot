package com.transportadora.transportadora.service;

import com.transportadora.transportadora.model.Encomenda;
import com.transportadora.transportadora.model.StatusEncomenda;
import com.transportadora.transportadora.repository.EncomendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncomendaService {
    private final EncomendaRepository repository;
    public EncomendaService(EncomendaRepository repository) {
        this.repository = repository;
    }

    public Encomenda criar(Encomenda encomenda) {
        encomenda.setStatus(StatusEncomenda.CRIADA);
        return repository.save(encomenda);
    }

    public List<Encomenda> listar(){
        return repository.findAll();
    }


    public Encomenda atualizarStatus(Long id, StatusEncomenda status) {
        Encomenda encomenda = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Encomenda não encontrada"));
        encomenda.setStatus(status);
        return repository.save(encomenda);


    }
}
