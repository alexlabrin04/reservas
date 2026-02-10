package com.alexlabrin04.reservas.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Reserva {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime inicio;
    private LocalDateTime fin;

    @ManyToOne
    private Usuario usuario;
}