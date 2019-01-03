package com.accenture.ieramos.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ChoferImpl implements Chofer {
	
	private String nombre;
	@Autowired
	private Vehiculo vehiculo;
	@Autowired
	//@Qualifier("licenciaParticular")
	@Qualifier("licenciaProfesional")
	private LicenciaConducir licenciaConducir;
	
	public void encenderVehiculo() {	
		System.out.println(nombre + ": Bueno.. voy a encender el vehiculo");
		vehiculo.encender();		
	}

	public void describirLicencia() {
		System.out.println(nombre + ": Mi licencia es -> " + licenciaConducir.getType());		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	

}
