package com.primerosauxilios.server.repositories;

import com.primerosauxilios.server.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
