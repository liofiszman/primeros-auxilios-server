package com.primerosauxilios.server.services.implementations;

import com.primerosauxilios.server.entities.PlantillaCursoEntrenamiento;
import com.primerosauxilios.server.repositories.PlantillaCursoEntrenamientoExamenRepository;
import com.primerosauxilios.server.repositories.PlantillaCursoEntrenamientoRepository;
import com.primerosauxilios.server.services.PlantillaCursoEntrenamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantillaCursoEntrenamientoServiceImplementation implements PlantillaCursoEntrenamientoService {

    @Autowired
    PlantillaCursoEntrenamientoRepository repository;

    @Override
    public PlantillaCursoEntrenamiento create(PlantillaCursoEntrenamiento plantillaCursoEntrenamiento) {
        return null;
    }

    @Override
    public PlantillaCursoEntrenamiento update(PlantillaCursoEntrenamiento plantillaCursoEntrenamiento, Integer id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<PlantillaCursoEntrenamiento> get() {
        return repository.findAll();
    }

    @Override
    public PlantillaCursoEntrenamiento getById(int id) {
        return null;
    }
}
