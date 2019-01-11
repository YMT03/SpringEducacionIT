package i.e.ramos.dao;

import java.util.List;

import i.e.ramos.bo.Persona;

public interface PersonaDAO {
	
	void addPersona(Persona persona);
	Persona getPersona(long id);
	List<Persona> getAllPersonas();
	void removePersona(long id);
	public void updatePersona(Persona persona);

}
