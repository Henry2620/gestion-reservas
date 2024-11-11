package com.example.gestionreservas.controller

import com.example.gestionreservas.dto.ReservacionDTO
import com.example.gestionreservas.service.ReservacionService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/reservaciones")
class ReservacionController(private val reservacionService: ReservacionService) {

    @GetMapping
    fun crearReservacion(
        @RequestParam nombrePaciente: String,
        @RequestParam fechaConsulta: String,
        @RequestParam horaConsulta: String,
        @RequestParam nombreMedico: String
    ): ResponseEntity<Map<String, Any>> {
        val reservacionDTO = ReservacionDTO(
            nombrePaciente = nombrePaciente,
            fechaConsulta = fechaConsulta,
            horaConsulta = horaConsulta,
            nombreMedico = nombreMedico
        )
        val reservacion = reservacionService.crearReservacion(reservacionDTO)
        val response = mapOf("status" to "success", "data" to reservacion)
        return ResponseEntity.ok(response)
    }
}
