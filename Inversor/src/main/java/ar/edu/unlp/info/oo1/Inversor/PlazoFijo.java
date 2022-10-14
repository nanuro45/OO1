package ar.edu.unlp.info.oo1.Inversor;

import java.time.Duration;
import java.time.LocalDate;

public class PlazoFijo extends Inversiones {

	LocalDate fechaDeConstitucion;
	double montoDeposito;
	double porcentajeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDeposito, double porcentajeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDeposito = montoDeposito;
		this.porcentajeInteresDiario = porcentajeInteresDiario;
	}
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}
	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}
	public double getMontoDeposito() {
		return montoDeposito;
	}
	public void setMontoDeposito(double montoDeposito) {
		this.montoDeposito = montoDeposito;
	}
	public double getPorcentajeInteresDiario() {
		return porcentajeInteresDiario;
	}
	public void setPorcentajeInteresDiario(double porcentajeInteresDiario) {
		this.porcentajeInteresDiario = porcentajeInteresDiario;
	}
	private double calculoInteresDiario() {
		int t =(int) Duration.between(fechaDeConstitucion.atStartOfDay(), LocalDate.now().atStartOfDay()).toDays();
		return (t*this.porcentajeInteresDiario)/100;
	}
	@Override
	public double valorActual() {
		return this.montoDeposito+(this.montoDeposito*calculoInteresDiario());
	}
}
