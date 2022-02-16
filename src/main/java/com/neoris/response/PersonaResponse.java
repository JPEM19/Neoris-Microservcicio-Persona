package com.neoris.response;

import com.neoris.entity.Persona;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PersonaResponse {
	
	private Long id; 
	
	private String nombre;
	
	private int edad;
	
	//private int idEmpresa; 
	
	private String empresa; 
	
	private String direccion;

	public PersonaResponse(Persona persona) {
		this.id = persona.getId();
		this.nombre = persona.getNombre();
		this.edad = persona.getEdad();
		
		this.empresa = persona.getIdEmpresa().getEmpresa();
		this.direccion = persona.getIdEmpresa().getDireccion();
	}
	
}
