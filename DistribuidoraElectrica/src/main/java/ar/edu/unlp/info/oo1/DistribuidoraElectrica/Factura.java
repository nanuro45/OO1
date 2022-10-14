package ar.edu.unlp.info.oo1.DistribuidoraElectrica;

import java.time.LocalDateTime;

public class Factura {
	private Usuario usuario;
	private double montoEnergiaActiva;
	private double descuento;
	
	public Factura(Usuario usuario, double montoEnergiaActiva, double descuento) {
		this.usuario = usuario;
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
	}
	private LocalDateTime fecha;
	
	public LocalDateTime getFecha() {
		return this.fecha;
	}
	public double getDescuento() {
		return this.descuento;
	}
	public Usuario getUsuario() {
		return this.usuario;
	}
	public double getMontoTotal() {
		return this.montoEnergiaActiva - this.descuento;
	}
}
