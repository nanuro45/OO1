package ar.edu.unlp.info.oo1.Banco;

public class CajaAhorro extends Cuenta {
	
	public CajaAhorro(double sald) {
		super(sald);
	}
	public boolean extraer(double monto) {
		if(this.puedeExtraer(monto)) {
			extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	public void depositar(double monto) {
		this.depositar(monto +(monto *0.02));
	}
	public boolean transferir(double monto, Cuenta unaCuenta) {
		return this.transferirACuenta(monto+(monto*0.02), unaCuenta);
	}
	@Override
	public void extraerSinControlar(double monto) {
		this.saldo -= monto+(monto*0.02);
		
	}
	@Override
	public boolean puedeExtraer(double monto) {
		if(this.getSaldo() > 0 && this.getSaldo() > monto) {
			return true;
		}
		return false;
	}
	
}
