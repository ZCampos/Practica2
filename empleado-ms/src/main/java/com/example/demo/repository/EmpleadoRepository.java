package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entidad.Empleado;
import com.example.demo.util.CustomRepository;

@Repository
public interface EmpleadoRepository extends CustomRepository<Empleado, Long>{

}
