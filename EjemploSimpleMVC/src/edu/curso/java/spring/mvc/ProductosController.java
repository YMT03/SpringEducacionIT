package edu.curso.java.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.curso.java.spring.model.Producto;
import edu.curso.java.spring.service.ProductoService;

@Controller
@RequestMapping(value = "/productos")
public class ProductosController {
	
	@Autowired
	private ProductoService productoService;
	
	@RequestMapping(value="/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("productos", productoService.getAll());
		return null;
	}
	
	@RequestMapping(value="/detalle", method = RequestMethod.GET)
	public String ver(Model model, @RequestParam("id") long id) {
		Producto producto = productoService.getById(id);
		model.addAttribute("producto", producto);
		return null;
	}

}
