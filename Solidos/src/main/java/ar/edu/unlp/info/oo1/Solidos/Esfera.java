package ar.edu.unlp.info.oo1.Solidos;

public class Esfera extends Pieza{
	private int radio;

	public Esfera(int radio, String material, String color) {
		super(material , color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	public int volumen() {
		return (int) (4/3 * Math.PI*Math.pow(this.radio,3));
	}
	public int superficie() {
		return (int) (4 * Math.PI * Math.pow(this.radio,2));
	}
}
