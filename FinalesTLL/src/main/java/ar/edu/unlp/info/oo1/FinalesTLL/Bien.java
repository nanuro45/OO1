package ar.edu.unlp.info.oo1.FinalesTLL;

public class Bien{
	

		String descrip;
		int cantidad;
		double costo_unidad;

		public Bien(String descrip, int cantidad, double costo_unidad) {
			super();
			this.descrip = descrip;
			this.cantidad = cantidad;
			this.costo_unidad = costo_unidad;
		}
		public String getDescrip() {
			return descrip;
		}
		public void setDescrip(String descrip) {
			this.descrip = descrip;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public double getCosto_unidad() {
			return costo_unidad;
		}
		public void setCosto_unidad(double costo_unidad) {
			this.costo_unidad = costo_unidad;
		}
		public double retornoBien() {
			return this.cantidad * this.costo_unidad;
		}
	
}
