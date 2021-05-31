package solid.entidades;

public abstract class CriaFormaGeometrica {

	private double altura;
	private double largura;
		
	public CriaFormaGeometrica(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public abstract double calculaArea ();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(largura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CriaFormaGeometrica other = (CriaFormaGeometrica) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(largura) != Double.doubleToLongBits(other.largura))
			return false;
		return true;
	}
	
	
}
