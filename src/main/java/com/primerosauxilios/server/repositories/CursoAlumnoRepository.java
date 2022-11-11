package com.primerosauxilios.server.repositories;

import com.primerosauxilios.server.entities.CursoAlumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CursoAlumnoRepository extends JpaRepository<CursoAlumno, Integer> {
    @Query("""
            select c from CursoAlumno c inner join c.curso.cursoAlumnos cursoAlumnos
            where c.curso.id = ?1 and cursoAlumnos.id = ?2""")
    Optional<CursoAlumno> findByCurso_IdAndCurso_CursoAlumnos_Id(Integer id, Integer id1);

}
