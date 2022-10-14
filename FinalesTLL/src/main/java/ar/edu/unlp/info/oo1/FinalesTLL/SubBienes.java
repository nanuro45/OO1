package ar.edu.unlp.info.oo1.FinalesTLL;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SubBienes extends Subsidios {
	public SubBienes(ArrayList<Bien>b,String nombre, LocalDateTime fecha_sol, String nombre_plan) {
		super(nombre, fecha_sol, nombre_plan);
		this.bienes = b;
		// TODO Auto-generated constructor stub
	}
	ArrayList<Bien> bienes = new ArrayList<Bien>();

	public ArrayList<Bien> getBienes() {
		return bienes;
	}

	public void setBienes(ArrayList<Bien> bienes) {
		this.bienes = bienes;
	}
	
	public void agregarBienes(Bien b) {
		this.bienes.add(b);
	}
	public double retornoBienes() {
		double tot = 0;
		for(int i=0; i < bienes.size(); i++) {
			tot += bienes.get(i).retornoBien(); // retorna en i (pos de la lista) el valor de retorno
		}
		return tot;
	}
	public String ToString() {
		String tx1 = "Nombre de Investigador: "+this.getNombre()+" Plan Trabajo: "+this.getNombre_plan()+" Fecha de soliciutud "+this.getFecha_sol();
		String tx2 = "";
		for(int i =0; i< bienes.size(); i++) {
			tx2 += bienes.get(i).getDescrip()+" , ";
		}
		return tx1 + tx2;
	}
}
