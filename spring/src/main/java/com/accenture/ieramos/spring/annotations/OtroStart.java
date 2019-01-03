package com.accenture.ieramos.spring.annotations;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OtroStart {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Perro perro = (Perro) context.getBean("perro");
		perro.ladrar();
		OtroBean otroBean = (OtroBean)context.getBean("asdE");
		otroBean.imprimir();
		
		//------------------------	
		Arrays.asList(1,2,3,4,5,6).forEach(x->{
			System.out.println("--------------------------");
		});
		//------------------------
		
		
		Chofer chofer = (Chofer)context.getBean("choferImpl");
		chofer.encenderVehiculo();
		chofer.describirLicencia();
	}

}
