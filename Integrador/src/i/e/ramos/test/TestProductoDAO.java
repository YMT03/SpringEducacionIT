package i.e.ramos.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import i.e.ramos.bo.Producto;
import i.e.ramos.dao.ProductoDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
@ContextConfiguration("/applicationContext.xml")
public class TestProductoDAO {
	
	@Autowired
	private ProductoDAO productoDAO;
	
	@Test
	public void testRecuperarProductos() {
		productoDAO.save(new Producto());
		List<Producto> productos = productoDAO.getAll();
		assertTrue(!productos.isEmpty());
		//assertTrue(productos.size()==1);
	}
	
}
