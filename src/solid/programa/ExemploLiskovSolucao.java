package solid.programa;

import solid.entidades.Quadrado;
import solid.entidades.Retangulo;

public class ExemploLiskovSolucao {

	public static void main(String[] args) {

		double numero1 = 10.1;
		double numero2 = 20.2;
		

		Retangulo rtg = new Retangulo(numero1,numero2);
		Quadrado qdr = new Quadrado(numero1,numero2);
		
		System.out.println(rtg.getClass() + " = " + rtg.toString() + " (Arredondado)\n"
				+ qdr.getClass() + " = " + qdr.toString() + " (Arredondado) \n\n"
						+ "Objetos Iguais? " + rtg.equals(qdr));
		
	}
}
