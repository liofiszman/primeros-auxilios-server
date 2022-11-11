package com.primerosauxilios.server.services.implementations;

import com.primerosauxilios.server.Utils;
import com.primerosauxilios.server.entities.Alumno;
import com.primerosauxilios.server.repositories.AlumnoRepository;
import com.primerosauxilios.server.services.AlumnoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImplementation implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Alumno create(Alumno alumno) {

        Alumno savedAlumno = alumnoRepository.save(alumno);
        return savedAlumno;
    }

    @Override
    public Alumno update(Alumno alumno, Integer id) {

        Alumno updatedAlumno = new Alumno();
        Optional<Alumno> savedAlumno = alumnoRepository.findById(id);
        Alumno updateAlumno = savedAlumno.get();
        if (savedAlumno.isPresent()) {
            BeanUtils.copyProperties(alumno, updateAlumno, Utils.getNullPropertyNames(alumno));
        }
        updatedAlumno = alumnoRepository.save(updateAlumno);
        return updatedAlumno;
    }

    @Override
    public void delete(int id) {

        Optional<Alumno> savedAlumno = alumnoRepository.findById(id);
        if (savedAlumno.isPresent()) {
            Alumno deletedAlumno = savedAlumno.get();
            alumnoRepository.delete(deletedAlumno);
        }
    }

    @Override
    public List<Alumno> get() {

        List<Alumno> alumnos = alumnoRepository.findAll();
        return alumnos;
    }

    @Override
    public Alumno getById(int id) {

        Alumno alumno = new Alumno();
        Optional<Alumno> savedAlumno = alumnoRepository.findById(id);
        if (savedAlumno.isPresent())
            return savedAlumno.get();
        return alumno;
    }


}
