package com.accenture.ieramos.spring.pojos;

public class PrimerBeanImpl implements PrimerBean {

	private String textoInicial;

	public PrimerBeanImpl() {
		System.out.println("Creando un nuevo PrimerBeanImpl");
	}
	public String getTextoInicial() {
		return textoInicial;
	}	
	public void setTextoInicial(String textoInicial) {
		this.textoInicial = textoInicial;
	}	

}
