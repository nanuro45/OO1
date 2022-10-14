package BalanzaProg;

public class Item {
	private String detalle;
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}

	private int cantidad;
	private double costoUnitario;
	
	public Item() {
		
	}
	public Item(String det, int cant , double cu) {
			this.detalle = det;
			this.cantidad = cant;
			this.costoUnitario = cu;
	}
	
	public double costo() {
		return this.costoUnitario * this.cantidad;
	}
	
	
}
