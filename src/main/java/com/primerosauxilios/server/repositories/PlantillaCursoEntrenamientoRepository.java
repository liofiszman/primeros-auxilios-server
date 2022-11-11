package com.primerosauxilios.server.repositories;

import com.primerosauxilios.server.entities.PlantillaCursoEntrenamiento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlantillaCursoEntrenamientoRepository extends MongoRepository<PlantillaCursoEntrenamiento, String> {
}
