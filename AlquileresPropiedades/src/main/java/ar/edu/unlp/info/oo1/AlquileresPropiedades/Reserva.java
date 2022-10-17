package ar.edu.unlp.info.oo1.AlquileresPropiedades;

import java.time.Duration;
import java.time.LocalDateTime;

public class Reserva {
	private LocalDateTime fechaIngreso;
	private LocalDateTime fechaFin;
	private Usuario inquilino;
	private Alquiler propAlquilada;
	
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public LocalDateTime getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Usuario getInquilino() {
		return inquilino;
	}
	public void setInquilino(Usuario inquilino) {
		this.inquilino = inquilino;
	}
	public Alquiler getPropAlquilada() {
		return propAlquilada;
	}
	public void setPropAlquilada(Alquiler propAlquilada) {
		this.propAlquilada = propAlquilada;
	}
	public boolean includesDate (LocalDateTime other) {
		return other.isAfter(this.getFechaIngreso()) && other.isBefore(this.getFechaFin()) ||
				other.equals(this.getFechaFin()) || other.equals(this.getFechaIngreso());
	}
	public int cantidadDeDias() {
		return (int) Duration.between(this.fechaIngreso,fechaFin).toDays();
	}
	public double precioReservaDias(Reserva r) {
		return this.propAlquilada.getPrecioNoche() * cantidadDeDias();
	}
}
