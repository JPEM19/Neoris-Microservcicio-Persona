package com.neoris.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.neoris.request.CreatePersonaRequest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="personas")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id; 
	
	@Column(name="nombre")
	private String nombre; 
	
	@Column(name="edad")
	private int edad; 
	
	@OneToOne
	@JoinColumn(name="idEmpresa")
	private Empresa idEmpresa; 
	
	public Persona (CreatePersonaRequest createPersonaRequest) {
		this.nombre = createPersonaRequest.getNombre();
		this.edad = createPersonaRequest.getEdad();
	}

	
	
}
