package ar.edu.unlp.info.oo1.CorreoAnidado;

public class Archivo {
	private String nombre;
	
	public double tamanio() {
		return this.nombre.length();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
