package com.primerosauxilios.server.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Curso_Alumno", schema = "PrimerosAuxilios")
public class CursoAlumno {
    private Integer id;

    @JsonBackReference
    private Curso curso;

    private Alumno alumno;

    private Integer notaFinal;

    @JsonIgnore
    private Set<CursoClasesAlumno> cursoClasesAlumnos = new LinkedHashSet<>();

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
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "curso_id", nullable = false)
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "alumno_id", nullable = false)
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Column(name = "nota_final")
    public Integer getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Integer notaFinal) {
        this.notaFinal = notaFinal;
    }

    @OneToMany(mappedBy = "cursoAlumno")
    public Set<CursoClasesAlumno> getCursoClasesAlumnos() {
        return cursoClasesAlumnos;
    }

    public void setCursoClasesAlumnos(Set<CursoClasesAlumno> cursoClasesAlumnos) {
        this.cursoClasesAlumnos = cursoClasesAlumnos;
    }

}
