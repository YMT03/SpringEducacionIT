package i.e.ramos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import i.e.ramos.service.ClienteService;

@Controller
@RequestMapping(value="/clients")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/home", method= RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("clientes", clienteService.getAllClients());
		return null;
	}
	
	@RequestMapping(value = "/home", method= RequestMethod.POST)
	public String saveCliente(Model model) {
		System.out.println("Entra");
		model.addAttribute("clientes", clienteService.getAllClients());
		return null;
	}

}
