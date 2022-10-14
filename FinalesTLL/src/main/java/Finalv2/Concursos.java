package Finalv2;

public class Concursos {

	public static void Main(String [] args) {
		
			Participante par1 = new Participante(1332,"Juan",21);
			Participante par2 = new Participante(2311,"Mau",23);
			Pareja par = new Pareja(par1,par2,"salsa");
			
			Concurso c = new Concurso();
			c.agregarPareja(par);
			
			Pareja x = c.retornoMayor();
			System.out.println("Nombre de participante 1: "+ par.getP1().getNombre() + "Nombre de Participante 2: "+ par.getP2().getNombre()+" Estilo: "+ par.getEstiloB());
			System.out.println("La pareja con mas diferencia de edad es: "+x);
	}
}
