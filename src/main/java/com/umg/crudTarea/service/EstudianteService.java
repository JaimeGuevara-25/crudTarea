package com.umg.crudTarea.service;

import com.umg.crudTarea.entity.Estudiante;
import com.umg.crudTarea.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;

    public List<Estudiante> getEstudiantes (){
        return estudianteRepository.findAll();
    }
    public Optional<Estudiante> getEstudiante (BigInteger id){
        return estudianteRepository.findById(id);
    }

    public void saveOrUpdate(Estudiante estudiante){
        estudianteRepository.save(estudiante);
    }
    public void delete(BigInteger id){
        estudianteRepository.deleteById(id);
    }


}
