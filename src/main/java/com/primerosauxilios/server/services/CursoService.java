package com.primerosauxilios.server.services;

import com.primerosauxilios.server.entities.Alumno;
import com.primerosauxilios.server.entities.Curso;
import com.primerosauxilios.server.entities.Profesor;

import java.util.List;

public interface CursoService {

    public Curso create(Curso curso);

    public Curso update(Curso curso, Integer id);

    public void delete(int id);

    public List<Curso> get();

    public Curso getById(int id);


}
