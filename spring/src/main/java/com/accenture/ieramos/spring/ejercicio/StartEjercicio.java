package com.accenture.ieramos.spring.ejercicio;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartEjercicio {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Banco banco = (Banco)context.getBean("banco");		
		System.out.println(banco);
		
	}

}
