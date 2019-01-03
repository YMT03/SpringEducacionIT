package com.accenture.ieramos.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class LicenciaProfesional implements LicenciaConducir{

	public String getType() {
		return "Profesional";
	}
	
	

}
