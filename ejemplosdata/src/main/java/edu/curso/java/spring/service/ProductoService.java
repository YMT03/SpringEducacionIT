package edu.curso.java.spring.service;

import edu.curso.java.spring.model.Producto;

public interface ProductoService {
	
	public void addProducto(Producto producto) throws ProductoException;

}
