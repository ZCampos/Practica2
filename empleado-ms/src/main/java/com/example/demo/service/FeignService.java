package com.example.demo.service;

import com.example.demo.dto.EmpresaDTO;

public interface FeignService {
	public EmpresaDTO obtenerNombreEmpresa(Long id);

}
