package com.umg.crudTarea.repository;

import com.umg.crudTarea.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface EstudianteRepository extends JpaRepository <Estudiante, BigInteger>{


}
