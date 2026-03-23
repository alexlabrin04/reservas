package com.alexlabrin04.reservas.service;

import com.alexlabrin04.reservas.model.Reserva;
import com.alexlabrin04.reservas.model.Usuario;
import com.alexlabrin04.reservas.repository.ReservaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservaService {
    private final ReservaRepository reservaRepository;
    public Reserva crearReserva(Reserva reserva){
        boolean existeSolapamiento = reservaRepository.existsByInicioLessThanAndFinGreaterThan(
                reserva.getFin(), reserva.getInicio()
        );
        if(existeSolapamiento){
            throw new RuntimeException("Reserva ya existente en ese intervalo.");
        }
        return reservaRepository.save(reserva);
    }
    public List<Reserva> obtenerReservasUsuario(Usuario usuario){
        return reservaRepository.findByUsuario(usuario);
    }
}