package Finalv2;

public class Pareja {
	Participante p1;
	Participante p2;
	String estiloB;
	
	public Pareja(Participante p1, Participante p2, String estiloB) {
		this.p1 = p1;
		this.p2 = p2;
		this.estiloB = estiloB;
	}
	public Participante getP1() {
		return p1;
	}
	public void setP1(Participante p1) {
		this.p1 = p1;
	}
	public Participante getP2() {
		return p2;
	}
	public void setP2(Participante p2) {
		this.p2 = p2;
	}
	public String getEstiloB() {
		return estiloB;
	}
	public void setEstiloB(String estiloB) {
		this.estiloB = estiloB;
	}
	public int diferenciaPareja() {
		int i = this.p1.getEdad() - this.p2.getEdad();
		if(i < 0){
			return i * (-1);
		}else {
			return i;
		}
		
	}
	
}
