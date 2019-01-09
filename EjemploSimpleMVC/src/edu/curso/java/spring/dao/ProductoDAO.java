package edu.curso.java.spring.dao;

import java.util.List;

import edu.curso.java.spring.model.Producto;

public interface ProductoDAO {
	
	void save(Producto producto);
	void update(Producto producto);
	void removeById(long id);
	Producto getById(long id);
	List<Producto> getAll();
	List<Producto> getAllThatStartsWith(String nombre);

}
