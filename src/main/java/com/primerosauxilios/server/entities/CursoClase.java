package com.primerosauxilios.server.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Curso_Clases", schema = "PrimerosAuxilios")
public class CursoClase {
    private Integer id;

    private Curso curso;

    private String plantillaModuloId;

    private String direccion;

    private String ciudad;

    private Instant fechaHora;

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
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "curso_id", nullable = false)
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Size(max = 100)
    @NotNull
    @Column(name = "plantilla_modulo_id", nullable = false, length = 100)
    public String getPlantillaModuloId() {
        return plantillaModuloId;
    }

    public void setPlantillaModuloId(String plantillaModuloId) {
        this.plantillaModuloId = plantillaModuloId;
    }

    @Size(max = 200)
    @NotNull
    @Column(name = "direccion", nullable = false, length = 200)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Size(max = 200)
    @NotNull
    @Column(name = "ciudad", nullable = false, length = 200)
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @NotNull
    @Column(name = "fecha_hora", nullable = false)
    public Instant getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Instant fechaHora) {
        this.fechaHora = fechaHora;
    }

    @OneToMany(mappedBy = "cursoClase")
    public Set<CursoClasesAlumno> getCursoClasesAlumnos() {
        return cursoClasesAlumnos;
    }

    public void setCursoClasesAlumnos(Set<CursoClasesAlumno> cursoClasesAlumnos) {
        this.cursoClasesAlumnos = cursoClasesAlumnos;
    }

}
