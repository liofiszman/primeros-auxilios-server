package com.primerosauxilios.server.controllers;


import com.primerosauxilios.server.entities.Alumno;
import com.primerosauxilios.server.services.implementations.AlumnoServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoServiceImplementation alumnoServiceImplementation;

    @PostMapping("/save")
    public ResponseEntity<?> create(@RequestBody Alumno alumno) {

        Alumno Response = alumnoServiceImplementation.create(alumno);
        return new ResponseEntity<>(Response, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody Alumno alumno, @PathVariable("id") Integer id) {

        Alumno Response = alumnoServiceImplementation.update(alumno, id);
        return new ResponseEntity<>(Response, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {

        alumnoServiceImplementation.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> get() {

        List<Alumno> alumnos = alumnoServiceImplementation.get();
        return new ResponseEntity<>(alumnos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Integer id) {

        Alumno alumno = alumnoServiceImplementation.getById(id);
        return new ResponseEntity<>(alumno, HttpStatus.OK);
    }

}
