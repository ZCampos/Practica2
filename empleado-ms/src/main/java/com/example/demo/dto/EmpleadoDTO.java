package com.example.demo.dto;

import java.sql.Date;

import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoDTO {
	
	private String nombre;
	
	private Long idEmpleado;
	
	@JsonProperty("apellido_paterno")
	private String apellidoPaterno;
	
	@JsonProperty("apellido_materno")
	private String apellidoMaterno;
	
	private String dni;
		
	@PastOrPresent
	@JsonProperty("fecha_ingreso")
	private Date fechaIngreso;
	
	private Boolean activo;
	
	private String empresa;
}
