package edu.curso.java.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.java.spring.dao.CategoriaDAO;
import edu.curso.java.spring.dao.ProductoDAO;
import edu.curso.java.spring.model.Categoria;
import edu.curso.java.spring.model.Producto;

@Service
@Transactional(rollbackFor=Exception.class)
public class ProductoServiceImp implements ProductoService{

	@Autowired
	private ProductoDAO productoDAO;
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	public Long save(Producto producto, Long categoriaId) {
		double precioConIVA = producto.getPrecio() * 1.21;
		producto.setPrecioConIVA(precioConIVA);
		Categoria categoria = categoriaDAO.getById(categoriaId);
		producto.setCategoria(categoria);
		productoDAO.save(producto);
		return producto.getId();
	}

	@Override
	public List<Producto> getAll() {
		return productoDAO.getAll();
	}
	
	@Override
	public Producto getById(long id) {
		return productoDAO.getById(id);
	}

	@Override
	public void removeById(long id) {
		productoDAO.removeById(id);		
	}

	@Override
	public List<Producto> getAllThatStartsWith(String nombre) {
		return productoDAO.getAllThatStartsWith(nombre);
	}

	@Override
	public void updateProducto(Producto producto, Long categoriaId) {
		Categoria categoria = categoriaDAO.getById(categoriaId);
		producto.setCategoria(categoria);
		productoDAO.update(producto);
	}

	@Override
	public Categoria categoriaById(Long id) {
		return categoriaDAO.getById(id);
	}

	@Override
	public List<Categoria> findAllCategorias() {
		return categoriaDAO.getAll();
	}
	
	
	
	
	
	
	

	
	
	
}
