package i.e.ramos.dao;

import java.util.List;

import i.e.ramos.bo.Producto;

public interface ProductoDAO {
	
	void save(Producto producto);
	void update(Producto producto);
	void removeById(long id);
	Producto getById(long id);
	List<Producto> getAll();
	List<Producto> getAllThatStartsWith(String nombre);

}
