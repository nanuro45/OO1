package ar.edu.unlp.info.oo1.AlquileresPropiedades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.DoubleStream;

public class OOBnB {
	private ArrayList<Reserva> reservas;
	private ArrayList<Usuario> inquilinos;
	
	public void agregarUsuario(Usuario u) {
		this.inquilinos.add(u);
	}
	public void agregarReserva(Reserva r,LocalDateTime c) {
		if(buscarPropiedadDisponible(c) != null) {		
			this.reservas.add(r);
		}
	}
	public ArrayList<Reserva> buscarPropiedadDisponible(LocalDateTime solicitud){
		return this.reservas.stream().map(r -> r.includesDate(solicitud)).collect(null);
	}
	public void eliminarReserva(LocalDateTime c) {
		if(buscarPropiedadPorFecha(c) != null) {
			this.reservas.remove(buscarPropiedadPorFecha(c));
		}
	}
	private Reserva buscarPropiedadPorFecha(LocalDateTime c) {
		return this.reservas.stream().filter(i -> i.includesDate(c)).findFirst().orElse(null);	
	}
	public DoubleStream calcularPrecioReserva(Reserva r) {
		return this.reservas.stream().mapToDouble(i -> i.precioReservaDias(r));	
	}
	public ArrayList<Reserva> reservasUsuario(Usuario u){
		return this.reservas.stream().filter(i -> i.getInquilino().getDni() == u.getDni()).collect(null);
	}
}
