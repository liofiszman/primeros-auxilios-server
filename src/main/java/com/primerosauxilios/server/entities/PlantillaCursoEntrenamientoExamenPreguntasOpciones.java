package com.primerosauxilios.server.entities;


public class PlantillaCursoEntrenamientoExamenPreguntasOpciones {

private int orden;
private String respuesta;
private boolean correcta;


    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
}
