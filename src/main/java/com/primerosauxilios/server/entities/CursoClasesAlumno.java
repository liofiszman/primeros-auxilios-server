package com.primerosauxilios.server.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Curso_Clases_Alumno", schema = "PrimerosAuxilios")
public class CursoClasesAlumno {
    private Integer id;

    @JsonIgnore
    private CursoClase cursoClase;

    @JsonIgnore
    private CursoAlumno cursoAlumno;

    private Boolean asistencia;

    private Integer notaExamen;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "curso_clase_id", nullable = false)
    public CursoClase getCursoClase() {
        return cursoClase;
    }

    public void setCursoClase(CursoClase cursoClase) {
        this.cursoClase = cursoClase;
    }

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "curso_alumno_id", nullable = false)
    public CursoAlumno getCursoAlumno() {
        return cursoAlumno;
    }

    public void setCursoAlumno(CursoAlumno cursoAlumno) {
        this.cursoAlumno = cursoAlumno;
    }

    @Column(name = "asistencia")
    public Boolean getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Boolean asistencia) {
        this.asistencia = asistencia;
    }

    @Column(name = "nota_examen")
    public Integer getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(Integer notaExamen) {
        this.notaExamen = notaExamen;
    }

}
