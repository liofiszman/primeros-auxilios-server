package com.primerosauxilios.server.services;

import com.primerosauxilios.server.entities.CursoAlumno;
import com.primerosauxilios.server.entities.CursoClase;

import java.util.List;

public interface CursoClasesService {

    public CursoClase create(CursoClase cursoClase);

    public CursoClase update(CursoClase cursoClase, Integer id);

    public void delete(int id);

    public List<CursoClase> get();

    public CursoClase getById(int id);

}
