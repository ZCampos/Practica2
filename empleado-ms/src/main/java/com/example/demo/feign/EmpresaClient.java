package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.EmpresaDTO;

@FeignClient("empresa-ms")
public interface EmpresaClient {
	
	@GetMapping("/empresa/nombre/{id}")
	public EmpresaDTO obtenerNombreEmpresa(@PathVariable Long id);
}
