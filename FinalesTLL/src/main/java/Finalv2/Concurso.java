package Finalv2;

import java.util.ArrayList;

public class Concurso {
	ArrayList<Pareja> parejas = new ArrayList<Pareja>();

	

	public ArrayList<Pareja> getParejas() {
		return parejas;
	}

	public void setParejas(ArrayList<Pareja> parejas) {
		this.parejas = parejas;
	}
	public void agregarPareja(Pareja p) {
		this.parejas.add(p);
	}
	public Pareja retornoMayor() {
		int m = 0;
		Pareja x = null;
		for(int i=0 ; i< parejas.size(); i++) {
			if(m < parejas.get(i).diferenciaPareja()) {
				m = parejas.get(i).diferenciaPareja();
				x = parejas.get(i);
			}
		}
		return x;
	}
}
