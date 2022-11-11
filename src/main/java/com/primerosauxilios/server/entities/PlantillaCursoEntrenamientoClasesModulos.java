package com.primerosauxilios.server.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.time.Instant;


public class PlantillaCursoEntrenamientoClasesModulos {

    private String nombre;

    private float duracion;

    private String contenido;

    private String examen;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }



}
