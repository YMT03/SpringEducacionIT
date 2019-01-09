package edu.curso.java.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.curso.java.spring.model.Producto;

@Repository
public class ProductoDAOImp implements ProductoDAO{

	@Autowired
	private SessionFactory sf;
	
	public void save(Producto producto) {
		sf.getCurrentSession().save(producto);
	}

	public void update(Producto producto) {
		sf.getCurrentSession().update(producto);
	}

	public void removeById(long id) {
		Producto p = (Producto)sf.getCurrentSession().load(Producto.class, id);
		sf.getCurrentSession().delete(p);
	}

	public Producto getById(long id) {
		return (Producto)sf.getCurrentSession().load(Producto.class, id);
	}

	public List<Producto> getAll() {
		return sf.getCurrentSession().createQuery("from Producto").list();
	}

	@Override
	public List<Producto> getAllThatStartsWith(String nombre) {
		return sf.getCurrentSession().createQuery("from Producto p WHERE p.nombre LIKE '"+ nombre +"%'").list();
	}
	
	
	

}
