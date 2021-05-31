package solid.entidades;

public class Retangulo extends CriaFormaGeometrica {
	
	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		super(altura, largura);
	}

	@Override
	public double calculaArea() {
		return 0;
	}

}
