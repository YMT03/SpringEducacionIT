package i.e.ramos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import i.e.ramos.bo.dto.ProductoDTO;

@RestController
@RequestMapping("/api/productos")
public class ProductosRestController {
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ProductoDTO> getProductoById(@PathVariable("id") Long id){
		//TODO -> Hardcoded
		ProductoDTO productoDTO = new ProductoDTO();
		productoDTO.setId(id);
		productoDTO.setNombre("productinho");
		productoDTO.setPrecio(123.0);
		return ResponseEntity.ok(productoDTO);
	}
}
