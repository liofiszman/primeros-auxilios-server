package com.primerosauxilios.server.services.implementations;

import com.primerosauxilios.server.Utils;
import com.primerosauxilios.server.entities.Alumno;
import com.primerosauxilios.server.entities.Profesor;
import com.primerosauxilios.server.repositories.AlumnoRepository;
import com.primerosauxilios.server.repositories.ProfesorRepository;
import com.primerosauxilios.server.services.AlumnoService;
import com.primerosauxilios.server.services.ProfesorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorServiceImplementation implements ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    @Override
    public Profesor create(Profesor profesor) {

        Profesor savedProfesor = profesorRepository.save(profesor);
        return savedProfesor;
    }

    @Override
    public Profesor update(Profesor profesor, Integer id) {

        Profesor updatedProfesor = new Profesor();
        Optional<Profesor> savedProfesor = profesorRepository.findById(id);
        Profesor updateProfesor = savedProfesor.get();
        if (savedProfesor.isPresent()) {
            BeanUtils.copyProperties(profesor, updateProfesor, Utils.getNullPropertyNames(profesor));
        }
        updatedProfesor = profesorRepository.save(updateProfesor);
        return updateProfesor;
    }

    @Override
    public void delete(int id) {

        Optional<Profesor> savedProfesor = profesorRepository.findById(id);
        if (savedProfesor.isPresent()) {
            Profesor deletedProfesor = savedProfesor.get();
            profesorRepository.delete(deletedProfesor);
        }
    }

    @Override
    public List<Profesor> get() {

        List<Profesor> profesores = profesorRepository.findAll();
        return profesores;
    }

    @Override
    public Profesor getById(int id) {


        Profesor profesor = new Profesor();
        Optional<Profesor> savedProfesor = profesorRepository.findById(id);
        if (savedProfesor.isPresent())
            return savedProfesor.get();
        return profesor;
    }


}
