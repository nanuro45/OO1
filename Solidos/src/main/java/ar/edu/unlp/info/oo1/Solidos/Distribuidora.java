package ar.edu.unlp.info.oo1.Solidos;

import java.util.ArrayList;

public class Distribuidora {
	ArrayList<Pieza> elementos;
	
	public double volumenDeMaterial(String material) {
		return this.elementos.stream().filter(e-> e.getMaterial().equals(material)).mapToDouble(c -> c.volumen()).sum();
	}
	public double superficieDeColor(String color) {
		return this.elementos.stream().filter(e ->e.getColor().equals(color)).mapToDouble(c -> c.superficie()).sum();
	}
}
