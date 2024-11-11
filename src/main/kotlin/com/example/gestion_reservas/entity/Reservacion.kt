package com.example.gestionreservas.entity

import jakarta.persistence.*

@Entity
@Table(name = "reservacion")
data class Reservacion(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val nombrePaciente: String,

    @Column(nullable = false)
    val fechaConsulta: String,

    @Column(nullable = false)
    val horaConsulta: String,

    @Column(nullable = false)
    val nombreMedico: String
)
