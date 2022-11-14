package com.primerosauxilios.server.controllers;


import com.primerosauxilios.server.entities.Curso;
import com.primerosauxilios.server.entities.CursoClase;
import com.primerosauxilios.server.services.implementations.CursoClaseServiceImplementation;
import com.primerosauxilios.server.services.implementations.CursoServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin

@RestController
@RequestMapping("/curso/clase")
public class CursoClaseController {

    @Autowired
    private CursoClaseServiceImplementation cursoClaseServiceImplementation;



    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody CursoClase cursoClase, @PathVariable("id") Integer id) {

        CursoClase Response = cursoClaseServiceImplementation.update(cursoClase, id);
        return new ResponseEntity<>(Response, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {

        cursoClaseServiceImplementation.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> get() {

        List<CursoClase> cursoClases = cursoClaseServiceImplementation.get();
        return new ResponseEntity<>(cursoClases, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Integer id) {

        CursoClase cursoClase = cursoClaseServiceImplementation.getById(id);
        return new ResponseEntity<>(cursoClase, HttpStatus.OK);
    }

}
