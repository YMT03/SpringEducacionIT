package com.accenture.ieramos.spring.pojos;

public class PrimerBeanImplNoSingleton {
	
	private String textoInicial;

	public PrimerBeanImplNoSingleton() {
		System.out.println("Creando un nuevo PrimerBeanImpl");
	}

	public String getTextoInicial() {
		return textoInicial;
	}

	public void setTextoInicial(String textoInicial) {
		this.textoInicial = textoInicial;
	}	
	

}
