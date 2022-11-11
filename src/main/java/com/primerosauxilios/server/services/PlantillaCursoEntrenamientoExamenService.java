package com.primerosauxilios.server.services;

import com.primerosauxilios.server.entities.PlantillaCursoEntrenamiento;
import com.primerosauxilios.server.entities.PlantillaCursoEntrenamientoClasesModulos;
import com.primerosauxilios.server.entities.PlantillaCursoEntrenamientoExamen;

import java.util.List;

public interface PlantillaCursoEntrenamientoExamenService {

    public PlantillaCursoEntrenamientoExamen create(PlantillaCursoEntrenamientoExamen plantillaCursoEntrenamientoExamen);

    public PlantillaCursoEntrenamientoExamen update(PlantillaCursoEntrenamientoExamen plantillaCursoEntrenamientoExamen, Integer id);

    public void delete(int id);

    public List<PlantillaCursoEntrenamientoExamen> get();

    public PlantillaCursoEntrenamientoExamen getById(int id);

}
