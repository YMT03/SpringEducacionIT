package edu.curso.java.spring.dao.genericdao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


public class GenericDAOImp<E, K extends Serializable> implements GenericDAO<E, K> {
	
	@Autowired
	private SessionFactory sessionFactory;

	private Class<E> entityClass;
	 
	public GenericDAOImp() {
	    ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
   this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[0];
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public K guardar(E elemento) {
		return (K) sessionFactory.getCurrentSession().save(elemento);
	}

	@Override
	public void actualizar(E elemento) {
		sessionFactory.getCurrentSession().update(elemento);		
	}

	@Override
	public void borrar(K id) {
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public E buscarPorId(K id) {
		return (E) sessionFactory.getCurrentSession().get(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> recuperarTodos() {
		return sessionFactory.getCurrentSession().createQuery("from " + entityClass.getName() + " obj").list();
	}

	@Override
	public List<E> recuperarTodos(int pagina, int rows) {
		Query query = sessionFactory.getCurrentSession().createQuery("from " + entityClass.getName() + " obj");
		query.setFirstResult(rows * (pagina - 1));
		query.setMaxResults(rows);
		return query.list();
	}

	@Override
	public Long contar() {
		// TODO Auto-generated method stub
		return (Long) sessionFactory.getCurrentSession().createQuery("select count(*) from " + entityClass.getName() + " obj").uniqueResult();
	}
		

}
