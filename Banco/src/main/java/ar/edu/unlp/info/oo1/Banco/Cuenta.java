package ar.edu.unlp.info.oo1.Banco;

public abstract class Cuenta {
	protected double saldo;
	
	public Cuenta(double sald) {
		this.saldo = sald;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void depositar(double monto) {
		this.saldo += monto;
	}
	public boolean extraer(double monto) {
		if(this.saldo > 0) {
			this.saldo -= monto;
			return true;
		}
		return false;
	}
	public boolean transferirACuenta(double monto,Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	public abstract void extraerSinControlar(double monto);
	
	
	public abstract boolean puedeExtraer(double monto);
	
}

