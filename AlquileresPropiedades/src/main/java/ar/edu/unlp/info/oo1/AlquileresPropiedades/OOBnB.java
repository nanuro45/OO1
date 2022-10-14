package ar.edu.unlp.info.oo1.AlquileresPropiedades;

import java.time.LocalDateTime;
import java.util.ArrayList;

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
	
	
}
