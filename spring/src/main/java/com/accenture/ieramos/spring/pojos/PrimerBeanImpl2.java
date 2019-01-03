package com.accenture.ieramos.spring.pojos;

public class PrimerBeanImpl2 implements PrimerBean {

	private String textoInicial;

	public PrimerBeanImpl2() {
		System.out.println("Creando un nuevo PrimerBeanImpl");
	}
	public String getTextoInicial() {
		return textoInicial + " JAJA";
	}	
	public void setTextoInicial(String textoInicial) {
		this.textoInicial = textoInicial.toUpperCase();
	}	

}
