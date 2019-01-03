package com.accenture.ieramos.spring.pojos;

public class SegundoBeanImpl {
	
	private PrimerBean primerBean;
	
	public void usarPrimerBean(){
		System.out.println("Estoy usando a primerBeanImpl en SegundoBeanImpl");
		System.out.println("Texto: " + primerBean.getTextoInicial());
	}

	public SegundoBeanImpl() {
		System.out.println("Creando un SegundoBeanImpl");
	}

	public PrimerBean getPrimerBean() {
		return primerBean;
	}

	public void setPrimerBean(PrimerBean primerBean) {
		System.out.println("Asginando un PrimerBeanImpl en SegundoBeanImpl");
		this.primerBean = primerBean;
	}
			
}
