package com.example.gestionreservas.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class ReservacionDTO(
    val id: Long? = null,

    @field:NotBlank(message = "El nombre del paciente es obligatorio")
    val nombrePaciente: String,

    @field:NotNull(message = "La fecha de la consulta es obligatoria")
    val fechaConsulta: String,

    @field:NotNull(message = "La hora de la consulta es obligatoria")
    val horaConsulta: String,

    @field:NotBlank(message = "El nombre del médico es obligatorio")
    val nombreMedico: String
)
