package ar.edu.unlp.info.oo1.MetodoLockUp;

public class EmpleadoJerarquico extends Empleado{

	public EmpleadoJerarquico(String nom) {
		super(nom);
	}
	public double sueldoBasico() {
		return super.sueldoBasico()+this.bonoPorCategoria();
	}
	public double bonoPorCategoria() {
		return 8000;
		
	}
	public double montoBasico() {
		return 45000;
	}

}
