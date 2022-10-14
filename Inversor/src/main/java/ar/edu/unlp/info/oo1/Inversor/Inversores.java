package ar.edu.unlp.info.oo1.Inversor;

import java.util.ArrayList;

public class Inversores{
	String nombre;
	ArrayList<Inversiones>inversiones ;
	
	public Inversores(String nombre, ArrayList<Inversiones> inversiones) {
		this.nombre = nombre;
		this.inversiones = inversiones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Inversiones> getInversiones() {
		return inversiones;
	}
	public void setInversiones(ArrayList<Inversiones> inversiones) {
		this.inversiones = inversiones;
	}
	public double valorActualDelPlazo() {
		return  this.inversiones.stream().mapToDouble(p -> p.valorActual()).sum();
	}
	
}
