package com.primerosauxilios.server.services;

import com.primerosauxilios.server.entities.Alumno;
import com.primerosauxilios.server.entities.Curso;
import com.primerosauxilios.server.entities.CursoAlumno;

import java.util.List;

public interface CursoAlumnoService {

    public CursoAlumno create(CursoAlumno cursoAlumno);

    public CursoAlumno update(CursoAlumno cursoAlumno, Integer id);

    public void delete(int id);

    public List<CursoAlumno> get();

    public CursoAlumno getById(int id);

}
