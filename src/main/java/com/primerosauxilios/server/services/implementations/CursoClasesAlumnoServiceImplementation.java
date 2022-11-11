package com.primerosauxilios.server.services.implementations;

import com.primerosauxilios.server.Utils;
import com.primerosauxilios.server.entities.CursoClase;
import com.primerosauxilios.server.entities.CursoClasesAlumno;
import com.primerosauxilios.server.repositories.CursoClasesAlumnoRepository;
import com.primerosauxilios.server.services.CursoClasesAlumnoService;
import com.primerosauxilios.server.services.CursoClasesService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoClasesAlumnoServiceImplementation implements CursoClasesAlumnoService {

    @Autowired
    private CursoClasesAlumnoRepository cursoClasesAlumnoRepository;

    @Override
    public CursoClasesAlumno create(CursoClasesAlumno cursoClasesAlumno) {

        CursoClasesAlumno savedCursoClaseAlumno = cursoClasesAlumnoRepository.save(cursoClasesAlumno);
        return savedCursoClaseAlumno;
    }

    @Override
    public CursoClasesAlumno update(CursoClasesAlumno cursoClasesAlumno, Integer id) {

        CursoClasesAlumno updatedCursoClaseAlumno = new CursoClasesAlumno();
        Optional<CursoClasesAlumno> savedCursoClaseAlumno = cursoClasesAlumnoRepository.findById(id);
        CursoClasesAlumno updateCursoClaseAlumno= savedCursoClaseAlumno.get();
        if (savedCursoClaseAlumno.isPresent()) {
            BeanUtils.copyProperties(cursoClasesAlumno, updateCursoClaseAlumno, Utils.getNullPropertyNames(cursoClasesAlumno));
        }
        updatedCursoClaseAlumno = cursoClasesAlumnoRepository.save(updateCursoClaseAlumno);
        return updatedCursoClaseAlumno;
    }

    @Override
    public void delete(int id) {

        Optional<CursoClasesAlumno> savedCursoAlumno = cursoClasesAlumnoRepository.findById(id);
        if (savedCursoAlumno.isPresent()) {
            CursoClasesAlumno deletedCursoAlumno = savedCursoAlumno.get();
            cursoClasesAlumnoRepository.delete(deletedCursoAlumno);
        }
    }

    @Override
    public List<CursoClasesAlumno> get() {

        List<CursoClasesAlumno> cursoClasesAlumnos = cursoClasesAlumnoRepository.findAll();
        return cursoClasesAlumnos;
    }

    @Override
    public CursoClasesAlumno getById(int id) {


        CursoClasesAlumno cursoClasesAlumno= new CursoClasesAlumno();
        Optional<CursoClasesAlumno> savedCursoClaseAlumno = cursoClasesAlumnoRepository.findById(id);
        if (savedCursoClaseAlumno.isPresent())
            return savedCursoClaseAlumno.get();
        return cursoClasesAlumno;
    }


}
