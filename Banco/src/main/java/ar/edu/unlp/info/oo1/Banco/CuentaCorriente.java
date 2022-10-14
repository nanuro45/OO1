package ar.edu.unlp.info.oo1.Banco;

public class CuentaCorriente extends Cuenta {
	private double descubierto;

	public CuentaCorriente(double desc , double sald) {
		super(sald);
		this.descubierto = desc;
		
	}

	public double getDescubierto() {
		return descubierto;
	}
	

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	public boolean extraer(double monto) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			if(getSaldo()<0) {
				this.descubierto += getSaldo();
			}
			return true;
		}
		return false;
	}
	public void deposito (double monto) {
		this.depositar(monto);
	}
	public boolean transferir(double monto,Cuenta unaCuenta) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			if(this.getSaldo() < 0) {
				this.descubierto += this.getSaldo();
			}
			unaCuenta.depositar(monto);
			return true;
		}
		return false;
	}

	public void extraerSinControlar(double monto) {
		this.saldo -= monto;
		
	}

	@Override
	public boolean puedeExtraer(double monto) {
		if(this.getSaldo() > 0) {
			return true;
		}
		return false;
	}
	
}
