package edu.curso.java.spring.dao.genericdao;



import java.io.Serializable;
import java.util.List;


public interface GenericDAO<E, K extends Serializable> {

	public K guardar(E elemento);
	public void actualizar(E elemento);
	public void borrar(K id);
	public E buscarPorId(K id);
	public List<E> recuperarTodos();
	public List<E> recuperarTodos(int pagina, int rows);
	public Long contar();
}
