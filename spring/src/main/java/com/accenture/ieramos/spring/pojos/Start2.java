package com.accenture.ieramos.spring.pojos;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start2 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		SegundoBeanImpl segundoBeanImpl = (SegundoBeanImpl)context.getBean("segundoBean");
		segundoBeanImpl.usarPrimerBean();		
	}

}
