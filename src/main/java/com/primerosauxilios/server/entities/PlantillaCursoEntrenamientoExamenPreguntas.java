package com.primerosauxilios.server.entities;


import java.util.List;

public class PlantillaCursoEntrenamientoExamenPreguntas {

private int orden;
private String pregunta;
private String tipo;
private List<PlantillaCursoEntrenamientoExamenPreguntasOpciones> opcionesList;


    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<PlantillaCursoEntrenamientoExamenPreguntasOpciones> getOpcionesList() {
        return opcionesList;
    }

    public void setOpcionesList(List<PlantillaCursoEntrenamientoExamenPreguntasOpciones> opcionesList) {
        this.opcionesList = opcionesList;
    }
}
