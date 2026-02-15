package com.alexlabrin04.reservas.repository;

import com.alexlabrin04.reservas.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByUsuario(Usuario usuario);
    boolean existsByInicioLessThanAndFinGreaterThan(LocalDateTime fin, LocalDateTime inicio);
}
