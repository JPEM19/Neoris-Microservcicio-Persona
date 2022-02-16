package com.neoris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.entity.Empresa;
import com.neoris.entity.Persona;
import com.neoris.repository.EmpresasRepository;
import com.neoris.repository.PersonaRepository;
import com.neoris.request.CreatePersonaRequest;

@Service
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;
	
	@Autowired
	EmpresasRepository empresaRespository;
	
	/*public List<Persona> getAllPersonas(String empresa){
		return personaRepository.findByEmpresaEmpresa(empresa);
	}*/
	
	public Persona createPersona (CreatePersonaRequest createPersonaRequest) {
		Persona persona = new Persona(createPersonaRequest);
		
		Empresa empresa = new Empresa(); 
		empresa.setEmpresa(createPersonaRequest.getEmpresa());
		empresa.setDireccion(createPersonaRequest.getDireccion());
		
		empresa = empresaRespository.save(empresa);
		
		persona.setIdEmpresa(empresa);
		persona = personaRepository.save(persona); 
		
		return persona; 
	}
	
}
