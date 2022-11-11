package com.primerosauxilios.server.services.implementations;

import com.primerosauxilios.server.Utils;
import com.primerosauxilios.server.entities.CursoAlumno;
import com.primerosauxilios.server.entities.Profesor;
import com.primerosauxilios.server.repositories.CursoAlumnoRepository;
import com.primerosauxilios.server.repositories.ProfesorRepository;
import com.primerosauxilios.server.services.CursoAlumnoService;
import com.primerosauxilios.server.services.ProfesorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoAlumnoServiceImplementation implements CursoAlumnoService {

    @Autowired
    private CursoAlumnoRepository cursoAlumnoRepository;

    @Override
    public CursoAlumno create(CursoAlumno cursoAlumno) {

        CursoAlumno savedCursoAlumno = cursoAlumnoRepository.save(cursoAlumno);
        return savedCursoAlumno;
    }

    @Override
    public CursoAlumno update(CursoAlumno cursoAlumno, Integer id) {

        CursoAlumno updatedCursoAlumno = new CursoAlumno();
        Optional<CursoAlumno> savedCursoAlumno = cursoAlumnoRepository.findById(id);
        CursoAlumno updateCursoAlumno = savedCursoAlumno.get();
        if (savedCursoAlumno.isPresent()) {
            BeanUtils.copyProperties(cursoAlumno, updateCursoAlumno, Utils.getNullPropertyNames(cursoAlumno));
        }
        updatedCursoAlumno = cursoAlumnoRepository.save(updateCursoAlumno);
        return updatedCursoAlumno;
    }

    @Override
    public void delete(int id) {

        Optional<CursoAlumno> savedCursoAlumno = cursoAlumnoRepository.findById(id);
        if (savedCursoAlumno.isPresent()) {
            CursoAlumno deletedCursoAlumno = savedCursoAlumno.get();
            cursoAlumnoRepository.delete(deletedCursoAlumno);
        }
    }

    @Override
    public List<CursoAlumno> get() {

        List<CursoAlumno> cursoAlumnos = cursoAlumnoRepository.findAll();
        return cursoAlumnos;
    }

    @Override
    public CursoAlumno getById(int id) {


        CursoAlumno cursoAlumno = new CursoAlumno();
        Optional<CursoAlumno> savedCursoAlumno = cursoAlumnoRepository.findById(id);
        if (savedCursoAlumno.isPresent())
            return savedCursoAlumno.get();
        return cursoAlumno;
    }


}
