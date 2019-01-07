package edu.curso.java.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.java.spring.dao.ProductoDAO;
import edu.curso.java.spring.model.Producto;

@Service
@Transactional(rollbackFor=Exception.class)
public class ProductoServiceImp implements ProductoService{

	@Autowired
	private ProductoDAO productoDAO;
	
	public void addProducto(Producto producto) throws ProductoException {
		double precioConIVA = producto.getPrecio() * 1.21;
		producto.setPrecioConIVA(precioConIVA);
		productoDAO.add(producto);
		//Excepcion para probar el transactional.. Debera hacer rollback
		if(producto.getPrecio()<0)
		throw new ProductoException("El precio ingresado es incorrecto");
	}

	
	
	
}
