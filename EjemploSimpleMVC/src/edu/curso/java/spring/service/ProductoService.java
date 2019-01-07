package edu.curso.java.spring.service;

import java.util.List;

import edu.curso.java.spring.model.Producto;

public interface ProductoService {
	
	long addProducto(Producto producto) throws ProductoException;
	
	List<Producto> getAll();
	
	Producto getById(long id);

}
