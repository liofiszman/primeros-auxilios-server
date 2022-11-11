package com.primerosauxilios.server.services.implementations;

import com.primerosauxilios.server.entities.PlantillaCursoEntrenamiento;
import com.primerosauxilios.server.entities.PlantillaCursoEntrenamientoExamen;
import com.primerosauxilios.server.repositories.PlantillaCursoEntrenamientoExamenRepository;
import com.primerosauxilios.server.services.PlantillaCursoEntrenamientoExamenService;
import com.primerosauxilios.server.services.PlantillaCursoEntrenamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantillaCursoEntrenamientoExamenServiceImplementation implements PlantillaCursoEntrenamientoExamenService {

    @Autowired
    PlantillaCursoEntrenamientoExamenRepository repository;

    @Override
    public PlantillaCursoEntrenamientoExamen create(PlantillaCursoEntrenamientoExamen plantillaCursoEntrenamientoExamen) {
        return null;
    }

    @Override
    public PlantillaCursoEntrenamientoExamen update(PlantillaCursoEntrenamientoExamen plantillaCursoEntrenamientoExamen, Integer id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<PlantillaCursoEntrenamientoExamen> get() {
        return null;
    }

    @Override
    public PlantillaCursoEntrenamientoExamen getById(int id) {
        return null;
    }
}
