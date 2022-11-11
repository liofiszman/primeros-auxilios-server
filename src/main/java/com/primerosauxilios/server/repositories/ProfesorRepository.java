package com.primerosauxilios.server.repositories;

import com.primerosauxilios.server.entities.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {
}
