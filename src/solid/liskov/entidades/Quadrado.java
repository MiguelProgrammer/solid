package solid.liskov.entidades;

public class Quadrado extends CriaFormaGeometrica {
	
	public Quadrado(double altura, double largura) {
		super(altura, largura);
	}

	@Override
	public double getArea() {
		return this.getAltura() * this.getLargura();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
