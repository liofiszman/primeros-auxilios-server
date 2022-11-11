package com.primerosauxilios.server.services.implementations;

import com.primerosauxilios.server.Utils;
import com.primerosauxilios.server.entities.*;
import com.primerosauxilios.server.repositories.CursoAlumnoRepository;
import com.primerosauxilios.server.repositories.CursoClaseRepository;
import com.primerosauxilios.server.repositories.CursoRepository;
import com.primerosauxilios.server.repositories.ProfesorRepository;
import com.primerosauxilios.server.services.CursoService;
import com.primerosauxilios.server.services.ProfesorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImplementation implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private CursoAlumnoRepository cursoAlumnoRepository;

    @Autowired
    private AlumnoServiceImplementation alumnoServiceImplementation;

    @Override
    public Curso create(Curso curso) {

        Curso savedcurso = cursoRepository.save(curso);
        return savedcurso;
    }

    @Override
    public Curso update(Curso curso, Integer id) {

        Curso updatedCurso = new Curso();
        Optional<Curso> savedCurso = cursoRepository.findById(id);
        Curso updateCurso = savedCurso.get();
        if (savedCurso.isPresent()) {
            BeanUtils.copyProperties(curso, savedCurso, Utils.getNullPropertyNames(curso));
        }
        updatedCurso = cursoRepository.save(updateCurso);
        return updatedCurso;
    }

    @Override
    public void delete(int id) {

        Optional<Curso> savedCurso = cursoRepository.findById(id);
        if (savedCurso.isPresent()) {
            Curso deletedCurso = savedCurso.get();
            cursoRepository.delete(deletedCurso);
        }
    }

    @Override
    public List<Curso> get() {

        List<Curso> profesores = cursoRepository.findAll();
        return profesores;
    }

    @Override
    public Curso getById(int id) {

        Curso curso = new Curso();
        Optional<Curso> savedCurso = cursoRepository.findById(id);
        if (savedCurso.isPresent())
            return savedCurso.get();
        return curso;
    }



}
