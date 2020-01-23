package com.example.demo.service;

import com.example.demo.entidad.Empresa;
import com.example.demo.exceptions.ValidacionException;

public interface EmpresaService {

	public Empresa obtenerNombreEmpresa(Long id) throws ValidacionException;
	
}
