package com.primerosauxilios.server.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.util.List;

@Document("plantilla_curso_entrenamiento")
public class PlantillaCursoEntrenamiento {

    private String nombre;

    private String creador;

    private Instant fechaCreacion;

    private Instant fechaUltimaActualizacion;

    private List<PlantillaCursoEntrenamientoClasesModulos> clasesModulos;

    private String examenFInal;

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Instant getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Instant fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Instant getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(Instant fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    public List<PlantillaCursoEntrenamientoClasesModulos> getClasesModulos() {
        return clasesModulos;
    }

    public void setClasesModulos(List<PlantillaCursoEntrenamientoClasesModulos> clasesModulos) {
        this.clasesModulos = clasesModulos;
    }

    public String getExamenFInal() {
        return examenFInal;
    }

    public void setExamenFInal(String examenFInal) {
        this.examenFInal = examenFInal;
    }



}
