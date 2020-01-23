package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmpleadoDTO;
import com.example.demo.dto.EmpresaDTO;
import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.FeignService;


@RestController
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private FeignService feignService;
	
	@GetMapping("/empleado/nombre/{id}")
	public EmpleadoDTO obtenerNombreEmpleado(@PathVariable Long id) throws ResourceNotFoundException {
	ModelMapper modelMapper = new ModelMapper();
	EmpleadoDTO empleadoDTO = modelMapper.map(empleadoService.obtenerEmpleadoPorId(id), EmpleadoDTO.class);
	EmpresaDTO empresaDTO = feignService.obtenerNombreEmpresa(empleadoDTO.getIdEmpleado());
	empleadoDTO.setEmpresa(empresaDTO.getNombre());
		return empleadoDTO;
		
	}

	
}
