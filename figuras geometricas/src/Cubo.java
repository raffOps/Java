
public class Cubo implements Figuras3Dimensoes {
	
	private double lado;
	private static final String formato = "Cubo";

	public Cubo(double lado) {
		if (lado < 0) {
			throw new IllegalArgumentException("Entrada inválida. Dimensao negativa");
		}
		this.lado = lado;
	}

	@Override
	public String getFormato() {
		return Cubo.formato;
	}

	@Override
	public String getDimensoes() {
		return "Lado: " + this.lado;
	}

	@Override
	public double getVolume() {
		return Math.pow(this.lado, 3);
	}
}
