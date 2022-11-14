package com.primerosauxilios.server.controllers;


import com.primerosauxilios.server.entities.Curso;
import com.primerosauxilios.server.entities.CursoClase;
import com.primerosauxilios.server.entities.Profesor;
import com.primerosauxilios.server.services.implementations.CursoClaseServiceImplementation;
import com.primerosauxilios.server.services.implementations.CursoServiceImplementation;
import com.primerosauxilios.server.services.implementations.ProfesorServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoServiceImplementation cursoServiceImplementation;

    @Autowired
    private CursoClaseServiceImplementation cursoClaseServiceImplementation;

    @PostMapping("{id}/clase/save")
    public ResponseEntity<?> createCursoClase(@RequestBody CursoClase cursoclase, @PathVariable("id") Integer cursoId) {

        CursoClase Response = cursoClaseServiceImplementation.create(cursoclase,cursoId);
        return new ResponseEntity<>(Response, HttpStatus.CREATED);
    }

    @PostMapping("/save")
    public ResponseEntity<?> create(@RequestBody Curso curso) {

        Curso Response = cursoServiceImplementation.create(curso);
        return new ResponseEntity<>(Response, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody Curso curso, @PathVariable("id") Integer id) {

        Curso Response = cursoServiceImplementation.update(curso, id);
        return new ResponseEntity<>(Response, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {

        cursoServiceImplementation.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> get() {

        List<Curso> cursos = cursoServiceImplementation.get();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Integer id) {

        Curso curso = cursoServiceImplementation.getById(id);
        return new ResponseEntity<>(curso, HttpStatus.OK);
    }

}
