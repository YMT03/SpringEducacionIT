package i.e.ramos.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	private double precio;
	private double precioConIVA;
	@ManyToOne
	private Categoria categoria;
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPrecioConIVA() {
		return precioConIVA;
	}
	public void setPrecioConIVA(double precioConIVA) {
		this.precioConIVA = precioConIVA;
	}
	
	

}
