package com.accenture.ieramos.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class Perro {

	public Perro() {
		System.out.println("CREANDO PERRO SINGLETON");
	}
	
	public void ladrar(){
		System.out.println("wof");
	}
	

}
