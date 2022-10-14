package ar.edu.unlp.info.oo1.DistribuidoraElectrica;

import java.time.LocalDateTime;

public class Consumo {
	private LocalDateTime fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public double factorDePotencia() {
		double fp = Math.pow(2,this.consumoEnergiaActiva) + Math.pow(2, this.consumoEnergiaReactiva);
		return this.consumoEnergiaActiva / Math.sqrt(fp);
	}
	public double costoEnBaseA(double precioKWa) {
		return this.consumoEnergiaActiva * precioKWa;
	}
	public double getConsumoEnergiaActiva() {
		return this.consumoEnergiaActiva;
	}
	public LocalDateTime getFecha() {
		return this.fecha;
	}
}
