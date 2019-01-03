package com.accenture.ieramos.spring.ejercicio;

public class CuentaCorriente extends CuentaBancaria{
	
	private double limite;

	@Override
	public double extraer(double monto) {
		if(getSaldo()-monto>=limite){
			setSaldo(getSaldo()-monto);
			return monto;
		}
		return 0;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [limite=" + limite + ", salgo=" + getSaldo() + ", numero=" + getNumero()
				+ ", notas=" + getNotas() + "]";
	}
	
	
	
}
