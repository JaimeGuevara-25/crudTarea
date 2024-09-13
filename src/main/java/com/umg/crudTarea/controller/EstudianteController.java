package com.umg.crudTarea.controller;

import com.umg.crudTarea.entity.Estudiante;
import com.umg.crudTarea.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/estudiantes")
//@CrossOrigin(origins = "http://localhost:3000")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> getAllEstudiantes() {
        return estudianteService.getEstudiantes();
    }

    @GetMapping("/{id}")
    public Optional<Estudiante> getEstudianteById(@PathVariable("studentId") BigInteger id) {
        return estudianteService.getEstudiante(id);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Estudiante estudiante){
        estudianteService.saveOrUpdate(estudiante);
    }
    @DeleteMapping("/{id}")
    public void deleteEstudiante(@PathVariable("studentId") BigInteger id){
        estudianteService.delete(id);
    }
}
