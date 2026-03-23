package com.alexlabrin04.reservas.controller;

import com.alexlabrin04.reservas.model.Reserva;
import com.alexlabrin04.reservas.service.ReservaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reservas")
@RequiredArgsConstructor
public class ReservaController {
    private final ReservaService reservaService;

    @PostMapping
    public Reserva crearReserva(Reserva reserva){
        return reservaService.crearReserva(reserva);
    }

    @GetMapping
    public List<Reserva> listarReservas(){
        return reservaService.obtenerReservasUsuario(null);
    }
}
