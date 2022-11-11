package com.primerosauxilios.server.services;

import com.primerosauxilios.server.entities.Alumno;

import java.util.List;

public interface AlumnoService {

    public Alumno create(Alumno alumno);

    public Alumno update(Alumno alumno, Integer id);

    public void delete(int id);

    public List<Alumno> get();

    public Alumno getById(int id);

}
