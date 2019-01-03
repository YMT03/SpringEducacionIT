package com.accenture.ieramos.spring.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VehiculoImpl implements Vehiculo{
	
	public void encender(){
		System.out.println("Runn runn");
	}

}
