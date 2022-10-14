package ar.edu.unlp.info.oo1.MetodoLockUp;

public class Gerente extends EmpleadoJerarquico {
	public Gerente(String nom) {
		super(nom);
	}
	public double aportes() {
		return this.montoBasico() * 0.05;
	}
	public double montoBasico() {
		return 57000;
	}
}
