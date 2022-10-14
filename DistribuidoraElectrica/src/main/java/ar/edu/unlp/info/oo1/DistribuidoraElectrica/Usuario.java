package ar.edu.unlp.info.oo1.DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.Optional;

public class Usuario {
	private String domicilio;
	private String nombre;
	private ArrayList<Factura> facturas;
	private ArrayList<Consumo> consumos;
	
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Consumo> getConsumos() {
		return consumos;
	}
	public void setConsumos(ArrayList<Consumo> consumos) {
		this.consumos = consumos;
	}
	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	public ArrayList<Factura> getFacturas(){
		return this.facturas;
	}
	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	public double ultimoConsumoActivo() {
		return this.verificarActivos().map((Consumo c) -> c.getConsumoEnergiaActiva()).orElse(0d);
	}
	private Optional<Consumo> verificarActivos() {
		return this.consumos.stream().max((Consumo f1,Consumo f2) -> f1.getFecha().compareTo(f2.getFecha()));
	}
	public Factura facturarEnBaseA(double precioKWh) {
		Consumo c = this.ultimoConsumo();
		double descuento = 0;
		if(c.factorDePotencia() > 0.8) {
			descuento = 10;
		}
		return new Factura (this,this.ultimoConsumo().costoEnBaseA(precioKWh),descuento);
	}
	public Consumo ultimoConsumo() {
		return this.verificarActivos().orElse(null);
	}
}
