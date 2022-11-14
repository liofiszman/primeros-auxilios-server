package com.primerosauxilios.server.repositories;

import com.primerosauxilios.server.entities.PlantillaCursoEntrenamiento;
import com.primerosauxilios.server.entities.PlantillaCursoEntrenamientoExamen;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PlantillaCursoEntrenamientoExamenRepository extends MongoRepository<PlantillaCursoEntrenamientoExamen, String> {
}
