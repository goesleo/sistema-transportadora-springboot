package com.transportadora.transportadora.controller;


import com.transportadora.transportadora.model.Encomenda;
import com.transportadora.transportadora.model.StatusEncomenda;
import com.transportadora.transportadora.service.EncomendaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encomendas")
public class EncomendaController {

    private final EncomendaService service;
    public EncomendaController(EncomendaService service) {
        this.service = service;
    }
    @PostMapping
    public Encomenda criar(@RequestBody Encomenda encomenda) {
        return service.criar(encomenda);
    }

    @GetMapping
    public List<Encomenda> listar() {
        return service.listar();
    }

    @PutMapping("/{id}/status")
    public Encomenda atualizarStatus(
            @PathVariable Long id,
            @RequestParam StatusEncomenda status) {
        return service.atualizarStatus(id, status);
    }



}
