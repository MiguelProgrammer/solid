package solid.liskov.entidades;

public class Retangulo extends CriaFormaGeometrica {
	
	public Retangulo(double altura, double largura) {
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
