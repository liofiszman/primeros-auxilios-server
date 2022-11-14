package com.primerosauxilios.server.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Alumno", schema = "PrimerosAuxilios")
public class Alumno {
    private Integer id;

    private String nombre;

    private String apellido;

    private String dni;

    private String telefono;

    private String email;

    private Integer externalId;

    @JsonIgnore
    private Set<CursoAlumno> cursoAlumnos = new LinkedHashSet<>();

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
    @Column(name = "nombre", nullable = false, length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Size(max = 100)
    @NotNull
    @Column(name = "apellido", nullable = false, length = 100)
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Size(max = 50)
    @Column(name = "DNI", length = 50)
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Size(max = 50)
    @Column(name = "telefono", length = 50)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Size(max = 100)
    @Column(name = "email", length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "external_id")
    public Integer getExternalId() {
        return externalId;
    }

    public void setExternalId(Integer externalId) {
        this.externalId = externalId;
    }

    @OneToMany(mappedBy = "alumno", fetch = FetchType.LAZY)
    public Set<CursoAlumno> getCursoAlumnos() {
        return cursoAlumnos;
    }

    public void setCursoAlumnos(Set<CursoAlumno> cursoAlumnos) {
        this.cursoAlumnos = cursoAlumnos;
    }

}
