package com.primerosauxilios.server.services.implementations;

import com.primerosauxilios.server.Utils;
import com.primerosauxilios.server.entities.CursoAlumno;
import com.primerosauxilios.server.entities.CursoClase;
import com.primerosauxilios.server.repositories.CursoAlumnoRepository;
import com.primerosauxilios.server.repositories.CursoClaseRepository;
import com.primerosauxilios.server.services.CursoAlumnoService;
import com.primerosauxilios.server.services.CursoClasesService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoClaseServiceImplementation implements CursoClasesService {

    @Autowired
    private CursoClaseRepository cursoClaseRepository;

    @Override
    public CursoClase create(CursoClase cursoClase) {

        CursoClase savedCursoClase = cursoClaseRepository.save(cursoClase);
        return savedCursoClase;
    }

    @Override
    public CursoClase update(CursoClase cursoClase, Integer id) {

        CursoClase updatedCursoClase = new CursoClase();
        Optional<CursoClase> savedCursoClase = cursoClaseRepository.findById(id);
        CursoClase updateCursoClase= savedCursoClase.get();
        if (savedCursoClase.isPresent()) {
            BeanUtils.copyProperties(cursoClase, updateCursoClase, Utils.getNullPropertyNames(cursoClase));
        }
        updatedCursoClase = cursoClaseRepository.save(updateCursoClase);
        return updatedCursoClase;
    }

    @Override
    public void delete(int id) {

        Optional<CursoClase> savedCursoAlumno = cursoClaseRepository.findById(id);
        if (savedCursoAlumno.isPresent()) {
            CursoClase deletedCursoAlumno = savedCursoAlumno.get();
            cursoClaseRepository.delete(deletedCursoAlumno);
        }
    }

    @Override
    public List<CursoClase> get() {

        List<CursoClase> cursoAlumnos = cursoClaseRepository.findAll();
        return cursoAlumnos;
    }

    @Override
    public CursoClase getById(int id) {


        CursoClase cursoClase= new CursoClase();
        Optional<CursoClase> savedCursoClase = cursoClaseRepository.findById(id);
        if (savedCursoClase.isPresent())
            return savedCursoClase.get();
        return cursoClase;
    }


}
