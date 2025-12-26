package com.transportadora.transportadora.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class Encomenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double peso;
    private String origem;
    private String destino;

    @Enumerated(EnumType.STRING)
    private StatusEncomenda status;


    @ManyToOne
    private Cliente cliente;
    public Encomenda() {}

}
