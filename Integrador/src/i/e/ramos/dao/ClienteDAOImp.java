package i.e.ramos.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import i.e.ramos.bo.Cliente;

@Repository
public class ClienteDAOImp implements ClienteDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Long save(Cliente cliente) {
		sessionFactory.getCurrentSession().save(cliente);
		return cliente.getId();
	}

	@Override
	public Cliente getById(Long id) {
		return (Cliente)sessionFactory.getCurrentSession().load(Cliente.class, id);
	}

	@Override
	public List<Cliente> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Cliente").list();
	}

	@Override
	public boolean removeById(Long id) {
		Cliente cliente = (Cliente)sessionFactory.getCurrentSession().load(Cliente.class, id);
		sessionFactory.getCurrentSession().delete(cliente);
		return true;
	}
	
	

}
