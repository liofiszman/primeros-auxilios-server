package com.primerosauxilios.server.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Curso", schema = "PrimerosAuxilios")
public class Curso {
    private Integer id;

    private String nombreCurso;

    private String plantillaCursoId;

    private String estado;

    private Profesor profesor;

    private Set<CursoAlumno> cursoAlumnos = new LinkedHashSet<>();

    private Set<CursoClase> cursoClases = new LinkedHashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Size(max = 100)
    @NotNull
    @Column(name = "nombre_curso", nullable = false, length = 100)
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    @Size(max = 100)
    @NotNull
    @Column(name = "plantilla_curso_id", nullable = false, length = 100)
    public String getPlantillaCursoId() {
        return plantillaCursoId;
    }

    public void setPlantillaCursoId(String plantillaCursoId) {
        this.plantillaCursoId = plantillaCursoId;
    }

    @Size(max = 20)
    @NotNull
    @Column(name = "estado", nullable = false, length = 20)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesor_id")
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @OneToMany(mappedBy = "curso")
    public Set<CursoAlumno> getCursoAlumnos() {
        return cursoAlumnos;
    }

    public void setCursoAlumnos(Set<CursoAlumno> cursoAlumnos) {
        this.cursoAlumnos = cursoAlumnos;
    }

    @OneToMany(mappedBy = "curso")
    public Set<CursoClase> getCursoClases() {
        return cursoClases;
    }

    public void setCursoClases(Set<CursoClase> cursoClases) {
        this.cursoClases = cursoClases;
    }

}
