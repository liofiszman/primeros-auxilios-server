package com.primerosauxilios.server.services;

import com.primerosauxilios.server.entities.Alumno;
import com.primerosauxilios.server.entities.PlantillaCursoEntrenamiento;
import com.primerosauxilios.server.entities.PlantillaCursoEntrenamientoClasesModulos;

import java.util.List;

public interface PlantillaCursoEntrenamientoService {

    public PlantillaCursoEntrenamiento create(PlantillaCursoEntrenamiento plantillaCursoEntrenamiento);

    public PlantillaCursoEntrenamiento update(PlantillaCursoEntrenamiento plantillaCursoEntrenamiento, Integer id);

    public void delete(int id);

    public List<PlantillaCursoEntrenamiento> get();

    public PlantillaCursoEntrenamiento getById(int id);

}
