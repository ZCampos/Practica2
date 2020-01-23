package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidad.Empresa;
import com.example.demo.exceptions.ValidacionException;
import com.example.demo.repository.EmpresaRepository;
import com.example.demo.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService{
	
	@Autowired
	EmpresaRepository empresaRepository;

	@Override
	public Empresa obtenerNombreEmpresa(Long id) throws ValidacionException{
		return empresaRepository.findById(id)
				.orElseThrow(()-> new ValidacionException("No fue encontrada ninguna empresa con el id: " + id));
		
	}

}
