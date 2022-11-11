package com.primerosauxilios.server.controllers;


import com.primerosauxilios.server.entities.Alumno;
import com.primerosauxilios.server.entities.Profesor;
import com.primerosauxilios.server.services.implementations.AlumnoServiceImplementation;
import com.primerosauxilios.server.services.implementations.ProfesorServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    private ProfesorServiceImplementation profesorServiceImplementation;

    @PostMapping("/save-user")
    public ResponseEntity<?> create(@RequestBody Profesor profesor) {

        Profesor Response = profesorServiceImplementation.create(profesor);
        return new ResponseEntity<>(Response, HttpStatus.CREATED);
    }

    @PutMapping("/update-user/{id}")
    public ResponseEntity<?> update(@RequestBody Profesor profesor, @PathVariable("id") Integer id) {

        Profesor Response = profesorServiceImplementation.update(profesor, id);
        return new ResponseEntity<>(Response, HttpStatus.OK);
    }

    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {

        profesorServiceImplementation.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> get() {

        List<Profesor> profesores = profesorServiceImplementation.get();
        return new ResponseEntity<>(profesores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Integer id) {

        Profesor profesor = profesorServiceImplementation.getById(id);
        return new ResponseEntity<>(profesor, HttpStatus.OK);
    }

}
