package com.accenture.ieramos.spring.ejercicio;

import java.util.List;

public abstract class CuentaBancaria {
	
	private double saldo;
	private String numero;
	private List<String> notas;
	
	public abstract double extraer(double monto);	
	
	public void depositar(double monto) {
		if(monto>0)
			setSaldo(getSaldo()+monto);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public List<String> getNotas() {
		return notas;
	}
	public void setNotas(List<String> notas) {
		this.notas = notas;
	}	
	
	

}
