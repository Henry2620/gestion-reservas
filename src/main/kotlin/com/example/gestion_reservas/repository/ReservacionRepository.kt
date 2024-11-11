package com.example.gestionreservas.repository

import com.example.gestionreservas.entity.Reservacion
import org.springframework.data.jpa.repository.JpaRepository

interface ReservacionRepository : JpaRepository<Reservacion, Long>
