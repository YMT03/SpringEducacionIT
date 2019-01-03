package com.accenture.ieramos.spring.ejercicio;

public class CajaAhorro extends CuentaBancaria{

	@Override
	public double extraer(double monto) {
		if(getSaldo()>=monto){
			setSaldo(getSaldo()-monto);
		}
		return monto;
	}

	@Override
	public String toString() {
		return "CajaAhorro [saldo=" + getSaldo() + ", numero" + getNumero() + ", notas=" + getNotas()
				+ "]";
	}
	
	
	
	

}
