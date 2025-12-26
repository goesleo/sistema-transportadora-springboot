package com.transportadora.transportadora.repository;

import com.transportadora.transportadora.model.Encomenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncomendaRepository  extends JpaRepository<Encomenda, Long> {
}
