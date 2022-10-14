package ar.edu.unlp.info.oo1.DistribuidoraElectrica;

import java.util.ArrayList;

public class Distribuidora {
	private double precioKwh;
	private ArrayList<Usuario> usuarios;
	
	public void agregarUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	public ArrayList<Factura> facturar(){
		ArrayList<Factura> factura = new ArrayList<Factura>();
		usuarios.stream().map((usuarios -> factura.add(usuarios.facturarEnBaseA(precioKwh))));
		return factura;
	}
	public double getPrecioKwh() {
		return this.precioKwh;
	}
	public double consumoTotalActiva() {
		return this.usuarios.stream().mapToDouble((Usuario usuario) -> usuario.ultimoConsumoActivo()).sum();
	}
}
