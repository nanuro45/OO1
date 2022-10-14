package ar.edu.unlp.info.oo1.Farolas;


import java.util.ArrayList;
import java.util.List;

public class Farola {

	boolean estado;
	ArrayList<Farola> farolas;

	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public ArrayList<Farola> getFarolas() {
		return farolas;
	}

	public void setFarolas(ArrayList<Farola> farolas) {
		this.farolas = farolas;
	}
	
	public Farola() {
		this.estado = false;
		this.farolas = new ArrayList<Farola>();
	}
	
	public void agregarFarola(Farola unaFarola) {
		this.farolas.add(unaFarola);
	}
	
	public void pairWithNeighbor(Farola unaFarola){
		if(!this.farolas.contains(unaFarola)) {
			this.agregarFarola(unaFarola);
			unaFarola.agregarFarola(this);
		}
	}
	
	public List<Farola> getNeighbors(){
		return this.farolas;
	}
	
	public boolean isOn() {
		if(this.estado = true) {
			return true;
		}
		return false;
	}
	
	public void turnOn() {
		if(!this.isOn()) {
			this.estado= true;
			this.farolas.stream().forEach(farolas -> farolas.turnOn());
		}
	}
	public void turnOff() {
		if(this.isOn()) {
			this.estado = false;
			this.farolas.stream().forEach(farolas -> farolas.turnOff());
		}
	}
}
