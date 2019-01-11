package i.e.ramos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/ejemplo")
public class EjemploController {

	@RequestMapping(value="/saludar", method=RequestMethod.GET)
	public String saludar(Model model) {
		model.addAttribute("texto", "Hola Spring MVC");
		return null;
	}

	@RequestMapping(value="/saludar2", method=RequestMethod.GET)
	public String saludar2(Model model) {
		model.addAttribute("texto", "Hola Spring MVC ejemplo 2");
		return "/ejemplo/saludar";
	}

	@RequestMapping(value="/saludar3", method=RequestMethod.GET)
	public String saludar3(Model model) {
		System.out.println("Estoy en saludar3");
		return "redirect:/ejemplo/saludar.html";
	}

	@RequestMapping(value="/saludar4", method=RequestMethod.GET)
	public ModelAndView saludar4(ModelAndView model) {
		model.setViewName("/ejemplo/saludar");
		model.addObject("texto", "Hola de nuevo");
		return model;
	}

	// URL -> /ejemplo/saludar5/pepe.html
	@RequestMapping(value="/saludar5/{nombre}", method=RequestMethod.GET)
	public ModelAndView saludar5(ModelAndView model, @PathVariable("nombre") String nombre) {
		model.setViewName("/ejemplo/saludar");
		model.addObject("texto", "Hola de nuevo " + nombre);
		return model;
	}

	// URL -> /ejemplo/saludar6.html?nombre=pepe
	@RequestMapping(value="/saludar6", method=RequestMethod.GET)
	public ModelAndView saludar6(ModelAndView model, @RequestParam("nombre") String nombre) {
		model.setViewName("/ejemplo/saludar");
		model.addObject("texto", "Hola de nuevo " + nombre);
		return model;
	}

	// URL -> /ejemplo/saludar7.html?nombre=pepe&edad=40
	@RequestMapping(value="/saludar7", method=RequestMethod.GET)
	public String saludar7(Model model, 
			@RequestParam("nombre") String nombre, 
			@RequestParam("edad") int edad) {
		model.addAttribute("texto", "Hola de nuevo " + nombre + " de " + edad + " años");
		return "/ejemplo/saludar";
	}

	// URL -> /ejemplo/saludar8/pepe/45.html
	@RequestMapping(value="/saludar8/{nombre}/{edad}", method=RequestMethod.GET)
	public String saludar8(Model model, 
			@PathVariable("nombre") String nombre,
			@PathVariable("edad") int edad) {
		model.addAttribute("texto", "Hola de nuevo " + nombre + " de " + edad + " años");
		return "/ejemplo/saludar";
	}


	// URL -> /ejemplo/saludar9.html?nombre=pepe&edad=40
	@RequestMapping(value="/saludar9", method=RequestMethod.POST)
	public String saludar9(Model model, 
			@RequestParam("nombre") String nombre, 
			@RequestParam("edad") int edad) {
		model.addAttribute("texto", "Hola de nuevo " + nombre + " de " + edad + " años");
		return "/ejemplo/saludar";
	}



}
