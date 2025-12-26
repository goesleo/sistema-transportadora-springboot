package com.transportadora.transportadora.service;

import com.transportadora.transportadora.model.Cliente;
import com.transportadora.transportadora.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {

        this.repository = repository;
    }


    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }


}
