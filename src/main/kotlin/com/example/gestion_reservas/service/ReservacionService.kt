package com.example.gestionreservas.service

import com.example.gestionreservas.dto.ReservacionDTO
import com.example.gestionreservas.entity.Reservacion
import com.example.gestionreservas.repository.ReservacionRepository
import org.springframework.stereotype.Service

@Service
class ReservacionService(private val reservacionRepository: ReservacionRepository) {

    fun crearReservacion(dto: ReservacionDTO): Reservacion {
        val reservacion = Reservacion(
            nombrePaciente = dto.nombrePaciente,
            fechaConsulta = dto.fechaConsulta,
            horaConsulta = dto.horaConsulta,
            nombreMedico = dto.nombreMedico
        )
        return reservacionRepository.save(reservacion)
    }
}
