package com.neoris.request;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreatePersonaRequest {
	
	@NotBlank(message = "First name is required")
	private String nombre;
	
	@NotBlank(message = "Last name is required")
	private int edad; 
	
	@NotBlank(message = "Empresa is required")
	private String empresa;
	
	@NotBlank(message = "Direccion is required")
	private String direccion;
	
}
