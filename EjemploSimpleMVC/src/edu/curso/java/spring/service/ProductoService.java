package edu.curso.java.spring.service;

import java.util.List;

import edu.curso.java.spring.model.Producto;

public interface ProductoService {
	
	long addProducto(Producto producto);
	
	List<Producto> getAll();
	
	Producto getById(long id);
	
	void removeById(long id);
	
	void updateProducto(Producto producto);
	
	List<Producto> getAllThatStartsWith(String nombre);

}
