package com.primerosauxilios.server.controllers;


import com.primerosauxilios.server.entities.Curso;
import com.primerosauxilios.server.entities.PlantillaCursoEntrenamiento;
import com.primerosauxilios.server.services.PlantillaCursoEntrenamientoService;
import com.primerosauxilios.server.services.implementations.CursoServiceImplementation;
import com.primerosauxilios.server.services.implementations.PlantillaCursoEntrenamientoServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plantillas")
public class PlantillaCursoController {

    @Autowired
    private PlantillaCursoEntrenamientoServiceImplementation service;

    @PostMapping("/save")
    public ResponseEntity<?> create(@RequestBody PlantillaCursoEntrenamiento object) {

        PlantillaCursoEntrenamiento Response = service.create(object);
        return new ResponseEntity<>(Response, HttpStatus.CREATED);
    }

    @PutMapping("/update-user/{id}")
    public ResponseEntity<?> update(@RequestBody PlantillaCursoEntrenamiento object, @PathVariable("id") Integer id) {

        PlantillaCursoEntrenamiento Response = service.update(object, id);
        return new ResponseEntity<>(Response, HttpStatus.OK);
    }

    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {

        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> get() {

        List<PlantillaCursoEntrenamiento> cursos = service.get();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Integer id) {

        PlantillaCursoEntrenamiento plantillaCursoEntrenamiento = service.getById(id);
        return new ResponseEntity<>(plantillaCursoEntrenamiento, HttpStatus.OK);
    }

}
