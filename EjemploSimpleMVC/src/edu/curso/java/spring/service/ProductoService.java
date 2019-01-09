package edu.curso.java.spring.service;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

import edu.curso.java.spring.model.Categoria;
import edu.curso.java.spring.model.Producto;

public interface ProductoService {
	
	Long save(Producto producto, Long categoriaId);
	
	List<Producto> getAll();
	
	Producto getById(long id);
	
	@PreAuthorize("hasAuthority('Administrator')")
	void removeById(long id);
	
	void updateProducto(Producto producto, Long categoriaId);
	
	List<Producto> getAllThatStartsWith(String nombre);
	
	Categoria categoriaById(Long id);
	
	List<Categoria> findAllCategorias();

}
