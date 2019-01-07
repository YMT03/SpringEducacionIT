package edu.curso.java.spring.dao;

import java.util.List;

import edu.curso.java.spring.model.Persona;

public interface PersonaDAO {
	
	void addPersona(Persona persona);
	Persona getPersona(long id);
	List<Persona> getAllPersonas();
	void removePersona(long id);
	public void updatePersona(Persona persona);

}
