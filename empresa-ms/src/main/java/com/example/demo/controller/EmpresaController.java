package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmpresaDTO;
import com.example.demo.exceptions.ValidacionException;
import com.example.demo.service.EmpresaService;


@RestController
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping("/empresa/nombre/{id}")
	public EmpresaDTO obtenerNombreEmpresa(@PathVariable Long id) throws ValidacionException {
		EmpresaDTO empresaDTO = new EmpresaDTO();
		empresaDTO.setNombre(empresaService.obtenerNombreEmpresa(id).getNombre());
		return empresaDTO;
		
	}

	
}
