package com.accenture.ieramos.spring.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nombre;
	private List<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
	
	public Banco(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<CuentaBancaria> getCuentas() {
		return cuentas;
	}
	public void setCuentas(List<CuentaBancaria> cuentas) {
		this.cuentas = cuentas;
	}
	
	private double getSaldoTotal(){
		double saldoTotal = 0;
		for(CuentaBancaria cuentaBancaria : cuentas)
			saldoTotal += cuentaBancaria.getSaldo();
		return saldoTotal;
	}
	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", saldoTotal=" + getSaldoTotal() +  ", cuentas=" + cuentas  + "]";
	}
	
	
	
	
	
	
}
