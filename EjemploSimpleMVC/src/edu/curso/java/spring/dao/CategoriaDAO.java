package edu.curso.java.spring.dao;

import java.util.List;

import edu.curso.java.spring.model.Categoria;

public interface CategoriaDAO {
	
	Categoria getById(Long id);
	public List<Categoria> getAll();

}
