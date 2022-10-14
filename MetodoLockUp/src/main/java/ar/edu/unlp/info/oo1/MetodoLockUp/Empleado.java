package ar.edu.unlp.info.oo1.MetodoLockUp;

public class Empleado {
	private String nombre;

	public Empleado(String nom) {
		this.nombre = nom;
	}
	public double aportes() {
		return 35000;
	}
	public double montoBasico() {
		return 13500;
	}
	public double sueldoBasico() {
		return this.montoBasico()+this.aportes();
	}
}
