package i.e.ramos.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import i.e.ramos.bo.Categoria;
import i.e.ramos.bo.Producto;
import i.e.ramos.dao.CategoriaDAO;
import i.e.ramos.dao.ProductoDAO;
import i.e.ramos.service.otros.EnvioDeEmailsUtil;

@Service
@Transactional(rollbackFor=Exception.class)
public class ProductoServiceImp implements ProductoService{

	@Autowired
	private ProductoDAO productoDAO;
	@Autowired
	private CategoriaDAO categoriaDAO;
	@Autowired
	private EnvioDeEmailsUtil envioDeEmailsUtil;
	
	public Long save(Producto producto, Long categoriaId) {
		double precioConIVA = producto.getPrecio() * 1.21;
		producto.setPrecioConIVA(precioConIVA);
		Categoria categoria = categoriaDAO.getById(categoriaId);
		producto.setCategoria(categoria);		
		productoDAO.save(producto);
		envioDeEmailsUtil.notificarNuevaAltaProducto();
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

	@CacheEvict(value="general",allEntries = true)
	public void newCategoria(Categoria categoria) {
		//TODO Hacer el alta
	}
	
	@Override
	@Cacheable("general")
	public List<Categoria> findAllCategorias() {
		System.out.println("Recuperando categorias.........");
		return categoriaDAO.getAll();
	}
	
	
	
	
	
	
	

	
	
	
}
