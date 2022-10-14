package BalanzaProg;

import java.util.ArrayList;

public class Presupuesto  {
	public int fecha;
	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Item> getItem() {
		return item;
	}

	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}

	public String cliente;
	public ArrayList<Item> item = new ArrayList<Item>();
	
	
	
	public Presupuesto(int fec,String c,Item i) {
		this.fecha=fec;
		this.cliente = c;
	}
	
	public void agregarItem(Item i) {
		item.add(i);
	}
	public double costoTotal() {
		return this.item.stream().mapToDouble(item -> this.costoTotal()).sum();
	}
}
