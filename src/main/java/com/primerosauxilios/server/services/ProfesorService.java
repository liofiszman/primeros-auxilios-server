package com.primerosauxilios.server.services;

import com.primerosauxilios.server.entities.Alumno;
import com.primerosauxilios.server.entities.Profesor;

import java.util.List;

public interface ProfesorService {

    public Profesor create(Profesor profesor);

    public Profesor update(Profesor profesor, Integer id);

    public void delete(int id);

    public List<Profesor> get();

    public Profesor getById(int id);

}
