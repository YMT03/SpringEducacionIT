package i.e.ramos.service;

import java.util.List;

import i.e.ramos.bo.Cliente;

public interface ClienteService {
	
	Long saveClient(Cliente cliente);
	Cliente getClientById(Long id);
	List<Cliente> getAllClients();
	boolean removeClientById(Long id);

}
