package ar.edu.unlp.info.oo1.Solidos;

public abstract class Pieza {
	String material;
	String color;
	Esfera esf;
	Cilindro cil;
	PrismaRectangular pr;
	
	public Pieza(String material, String color) {
		super();
		this.material = material;
		this.color = color;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract int volumen();
	public abstract int superficie();
}
