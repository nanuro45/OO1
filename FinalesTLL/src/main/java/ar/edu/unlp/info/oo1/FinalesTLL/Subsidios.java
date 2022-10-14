package ar.edu.unlp.info.oo1.FinalesTLL;

import java.time.LocalDateTime;

public class Subsidios {
	
	private String nombre;
	private LocalDateTime fecha_sol;
	private String nombre_plan;
	
	public Subsidios(String nombre, LocalDateTime fecha_sol, String nombre_plan) {
		this.nombre = nombre;
		this.fecha_sol = fecha_sol;
		this.nombre_plan = nombre_plan;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDateTime getFecha_sol() {
		return fecha_sol;
	}
	public void setFecha_sol(LocalDateTime fecha_sol) {
		this.fecha_sol = fecha_sol;
	}
	public String getNombre_plan() {
		return nombre_plan;
	}
	public void setNombre_plan(String nombre_plan) {
		this.nombre_plan = nombre_plan;
	}
	
}