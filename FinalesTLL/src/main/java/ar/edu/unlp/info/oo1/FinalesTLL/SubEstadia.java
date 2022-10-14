package ar.edu.unlp.info.oo1.FinalesTLL;
import java.time.LocalDateTime;

public class SubEstadia extends Subsidios {
		String destino;
		double costo_pasajes;
		int cantidad_dias;
		double monto_diaH;
		
		public SubEstadia(String destino, double costo_pasajes, int cantidad_dias, double monto_diaH, String n , LocalDateTime x , String w) {
			super(n,x,w);
			this.destino = destino;
			this.costo_pasajes = costo_pasajes;
			this.cantidad_dias = cantidad_dias;
			this.monto_diaH = monto_diaH;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public double getCosto_pasajes() {
			return costo_pasajes;
		}
		public void setCosto_pasajes(double costo_pasajes) {
			this.costo_pasajes = costo_pasajes;
		}
		public int getCantidad_dias() {
			return cantidad_dias;
		}
		public void setCantidad_dias(int cantidad_dias) {
			this.cantidad_dias = cantidad_dias;
		}
		public double getMonto_diaH() {
			return monto_diaH;
		}
		public void setMonto_diaH(double monto_diaH) {
			this.monto_diaH = monto_diaH;
		}
		
		public double retornoEstadia() {
			return this.costo_pasajes + this.cantidad_dias * this.monto_diaH;
		}
		
		public String ToString() {
			return "Nombre Investigador: "+this.getNombre()+" Plan de trabajo: "+this.getNombre_plan()+" Fecha de Solicitud: "+this.getFecha_sol()+" Monto total: "+this.retornoEstadia()+" Lugar Estadia:"+ this.destino+" Dias de Estadia: "+ this.cantidad_dias;
		}
		
}
