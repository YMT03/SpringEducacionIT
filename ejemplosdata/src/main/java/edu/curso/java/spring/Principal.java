package edu.curso.java.spring;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.curso.java.spring.dao.PersonaDAO;
import edu.curso.java.spring.model.Persona;
import edu.curso.java.spring.model.Producto;
import edu.curso.java.spring.service.ProductoException;
import edu.curso.java.spring.service.ProductoService;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//PersonaDAO personaDAO = context.getBean(PersonaDAO.class);
		//Persona persona = new Persona("Ignacio", "Ramos");
		//personaDAO.addPersona(persona);
		//personaDAO.addPersona(new Persona("Ludmila","Jaroszuk"));
		//personaDAO.addPersona(new Persona("Natasha","Chialli"));
		
		//personaDAO.removePersona(2);
		
		//Persona persona = personaDAO.getPersona(1);
		//System.out.println(persona.getNombre() + " " + persona.getApellido());
		
		//Persona persona = new Persona("Nati","Chialli");
		//persona.setIdPersona(7);
		//personaDAO.updatePersona(persona);
		
		//List<Persona> list = personaDAO.getAllPersonas();
		//for(int i = 0; i<list.size(); i++){
		//	System.out.println(list.get(i).getNombre() + " " + list.get(i).getApellido());
		//}
		
		Producto producto = new Producto();
		producto.setNombre("Teclado");
		producto.setPrecio(1200);
		
		ProductoService productoService = context.getBean(ProductoService.class);
		try {
			productoService.addProducto(producto);
		} catch (ProductoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
