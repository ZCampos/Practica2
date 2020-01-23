package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmpresaDTO;
import com.example.demo.feign.EmpresaClient;
import com.example.demo.service.FeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class FeignServiceImpl implements FeignService{
	
	@Autowired
	private EmpresaClient empresaClient;
	
	@HystrixCommand(fallbackMethod = "obtenerEmpresaDefecto")
	@Override
	public EmpresaDTO obtenerNombreEmpresa(Long id) {
		return empresaClient.obtenerNombreEmpresa(id);
	}
	
	public EmpresaDTO obtenerEmpresaDefecto(Long id) {
		EmpresaDTO empresaDTO = new EmpresaDTO();
		empresaDTO.setNombre("");
		return empresaDTO;
	}
}
