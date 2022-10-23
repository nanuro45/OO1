package ar.edu.unlp.info.oo1.AlquileresPropiedades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class OOBnB {
	private ArrayList<Reserva> reservas;
	private ArrayList<Usuario> inquilinos;

	
	
	public OOBnB() {
		super();
		this.reservas = new ArrayList<Reserva>();
		this.inquilinos = new ArrayList<Usuario>();
	}
	
	public void agregarUsuario(Usuario u) {
		this.inquilinos.add(u);
	}
	public void agregarReserva(Reserva r,LocalDateTime c) {
		if(buscarPropiedadDisponible(c) != null) {		
			this.reservas.add(r);
		}
	}
	public ArrayList<Reserva> buscarPropiedadDisponible(LocalDateTime solicitud){
		return this.reservas.stream().filter(r -> r.includesDate(solicitud)).collect(Collectors.toCollection(ArrayList::new));
	}
	public void eliminarReserva(LocalDateTime c) {
		if(buscarPropiedadPorFecha(c) != null) {
			this.reservas.remove(buscarPropiedadPorFecha(c));
		}
	}
	private Reserva buscarPropiedadPorFecha(LocalDateTime c) {
		return this.reservas.stream().filter(i -> i.includesDate(c)).findFirst().orElse(null);	
	}
	public double calcularPrecioReserva(Reserva r) {
		return r.precioReservaDias();
	}
	public ArrayList<Reserva> reservasUsuario(Usuario u){
		return this.reservas.stream().filter(i -> i.getInquilino().getDni() == u.getDni()).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public double calculoMontoCancelacion(Reserva r, LocalDateTime fechaEstimativa) {
		switch(r.getTipoCancelacion()){
			case "flexible":{
				return r.precioReservaDias();
			}
			case "moderada":{
				return r.cantidadDiasDiferencia(fechaEstimativa);
			}
			default:{
				return 0;
			}
		}

	}
}
