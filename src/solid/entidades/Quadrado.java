package solid.entidades;

public class Quadrado extends CriaFormaGeometrica {
	
	private double altura;
	private double largura;

	public Quadrado(double altura, double largura) {
		super(altura, largura);
	}

	@Override
	public double calculaArea() {
		return 0;
	}
	

}
