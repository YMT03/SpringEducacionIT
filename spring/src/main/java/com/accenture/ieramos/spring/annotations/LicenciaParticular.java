package com.accenture.ieramos.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class LicenciaParticular implements LicenciaConducir {

	public String getType() {
		return "Particular";
		
	}
	
	
	

}
