package edu.curso.java.spring.mvc;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.curso.java.spring.model.Producto;
import edu.curso.java.spring.mvc.form.ProductoForm;
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
	
	@RequestMapping(value="/listar", method = RequestMethod.POST)
	public String buscar(Model model, @RequestParam("nombre") String nombre) {
		List<Producto> productos = productoService.getAllThatStartsWith(nombre);
		model.addAttribute("productos", productos);
		return null;
	}
	

	@RequestMapping(value="/detalle", method = RequestMethod.GET)
	public String ver(Model model, @RequestParam("id") long id) {
		Producto producto = productoService.getById(id);
		model.addAttribute("producto", producto);
		return null;
	}

	@RequestMapping(value="/borrar", method = RequestMethod.GET)
	public String borrar(Model model, @RequestParam("id") long id) {
		productoService.removeById(id);
		return "redirect:/productos/listar.html";
	}

	@RequestMapping(value="/editar", method = RequestMethod.GET)
	public String editar(Model model, @RequestParam("id") long id) {
		Producto producto = productoService.getById(id);
		ProductoForm productoForm = new ProductoForm();
		productoForm.setId(id);
		productoForm.setNombre(producto.getNombre());
		productoForm.setPrecio(producto.getPrecio());
		model.addAttribute("productoForm",productoForm);
		return "/productos/form";
	}
	
	@RequestMapping(value="/nuevo", method = RequestMethod.GET)
	public String editar(Model model) {
		ProductoForm productoForm = new ProductoForm();
		productoForm.setNombre("Ej:. Teclado");
		productoForm.setPrecio(0.0);
		model.addAttribute("productoForm",productoForm);
		return "/productos/form";
	}
	

	@RequestMapping(value="/guardar", method = RequestMethod.POST)
	public String guardar(@ModelAttribute("productoForm") @Valid ProductoForm productoForm,
			BindingResult result, Model model) {
		if(result.hasErrors()) 
			return "/productos/form";
		Long id = productoForm.getId();
		if(id==null) {
			Producto producto = new Producto();
			producto.setNombre(productoForm.getNombre());
			producto.setPrecio(productoForm.getPrecio());
			productoService.addProducto(producto);			
		} else {
			Producto producto = productoService.getById(id);
			producto.setNombre(productoForm.getNombre());
			producto.setPrecio(productoForm.getPrecio());
			productoService.updateProducto(producto);
		}
		return "redirect:/productos/listar.html";
	}

}
