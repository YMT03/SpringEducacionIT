package i.e.ramos.dao;

import java.util.List;

import i.e.ramos.bo.Categoria;

public interface CategoriaDAO {
	
	Categoria getById(Long id);
	public List<Categoria> getAll();

}
