package com.primerosauxilios.server.repositories;

import com.primerosauxilios.server.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
