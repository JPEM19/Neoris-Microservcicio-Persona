package com.neoris.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.entity.Persona;
import com.neoris.request.CreatePersonaRequest;
import com.neoris.response.PersonaResponse;
import com.neoris.service.PersonaService;

@RestController
@RequestMapping("/api/persona/")
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	/*@GetMapping("/getAll/{empresa}")
	public List<PersonaResponse> getAllPersonas(@PathVariable String empresa) {
		
		List<Persona> personaList = personaService.getAllPersonas(empresa);
		List<PersonaResponse> personaResponseList = new ArrayList<PersonaResponse>(); 
	
		personaList.stream().forEach(persona ->{
			personaResponseList.add(new PersonaResponse(persona));
		});
		
		return personaResponseList;
		
	}*/
	
	@PostMapping("/create")
	public PersonaResponse createPersona(@RequestBody CreatePersonaRequest createPersonaRequest) {
		Persona persona = personaService.createPersona(createPersonaRequest);
		
		return new PersonaResponse(persona);
	}
	
	
	
}
