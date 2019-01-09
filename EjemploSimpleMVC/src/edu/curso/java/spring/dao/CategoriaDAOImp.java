package edu.curso.java.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.curso.java.spring.model.Categoria;

@Repository
public class CategoriaDAOImp implements CategoriaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Categoria getById(Long id) {
		return (Categoria)sessionFactory.getCurrentSession().load(Categoria.class, id);
	}

	@Override
	public List<Categoria> getAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Categoria AS c ORDER BY c.nombre").list();
	}
	
	

}
