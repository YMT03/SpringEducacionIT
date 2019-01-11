package i.e.ramos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import i.e.ramos.bo.Cliente;
import i.e.ramos.dao.ClienteDAO;

@Service
public class ClienteServiceImp implements ClienteService{

	@Autowired
	private ClienteDAO clienteDAO;
	
	@Override
	public Long saveClient(Cliente cliente) {
		return clienteDAO.save(cliente);
	}

	@Override
	public Cliente getClientById(Long id) {
		return clienteDAO.getById(id);
	}

	@Override
	public List<Cliente> getAllClients() {
		return clienteDAO.getAll();
	}

	@Override
	public boolean removeClientById(Long id) {
		return clienteDAO.removeById(id);
	}
	
	

}
