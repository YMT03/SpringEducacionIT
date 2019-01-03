package com.accenture.ieramos.spring.pojos;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		
		//BASICO - SINGLETON
		
		PrimerBean primerBeanImpl = (PrimerBean)context.getBean("primerBean");

		primerBeanImpl.setTextoInicial("Hola");

		PrimerBean primerBeanImpl2 = (PrimerBean)context.getBean("primerBean");

		System.out.println(primerBeanImpl2.getTextoInicial());

		System.out.println(primerBeanImpl.equals(primerBeanImpl2));


		System.out.println("----------------------------------");
		
		//NO SINGLETON
		
		
		PrimerBeanImplNoSingleton primerBeanImplNoSingleton = (PrimerBeanImplNoSingleton)context.getBean("primerBeanNoSingleton");

		primerBeanImplNoSingleton.setTextoInicial("Hola");

		PrimerBeanImplNoSingleton primerBeanImpllNoSingleton2 = (PrimerBeanImplNoSingleton)context.getBean("primerBeanNoSingleton");

		System.out.println(primerBeanImpllNoSingleton2.getTextoInicial());

		System.out.println(primerBeanImplNoSingleton.equals(primerBeanImpllNoSingleton2));


	}

}
