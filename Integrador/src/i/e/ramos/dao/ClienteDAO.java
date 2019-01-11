package i.e.ramos.dao;

import java.util.List;

import i.e.ramos.bo.Cliente;

public interface ClienteDAO {
	
	Long save(Cliente cliente);
	Cliente getById(Long id);
	List<Cliente> getAll();
	boolean removeById(Long id);
	
}
