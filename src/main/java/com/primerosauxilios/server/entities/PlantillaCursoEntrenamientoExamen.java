package com.primerosauxilios.server.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.time.Instant;
import java.util.List;

@Document("plantilla_curso_entrenamiento_examen")
public class PlantillaCursoEntrenamientoExamen {


    @Id
    private String id;

    private List<PlantillaCursoEntrenamientoExamenPreguntas> preguntas;


    private String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }


    public List<PlantillaCursoEntrenamientoExamenPreguntas> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<PlantillaCursoEntrenamientoExamenPreguntas> preguntas) {
        this.preguntas = preguntas;
    }
}
