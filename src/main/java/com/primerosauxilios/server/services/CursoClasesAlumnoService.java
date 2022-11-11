package com.primerosauxilios.server.services;

import com.primerosauxilios.server.entities.CursoClase;
import com.primerosauxilios.server.entities.CursoClasesAlumno;

import java.util.List;

public interface CursoClasesAlumnoService {

    public CursoClasesAlumno create(CursoClasesAlumno cursoClasesAlumno);

    public CursoClasesAlumno update(CursoClasesAlumno cursoClasesAlumno, Integer id);

    public void delete(int id);

    public List<CursoClasesAlumno> get();

    public CursoClasesAlumno getById(int id);

}
