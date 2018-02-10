
public class Quadrado implements Figuras2Dimensoes {
	
	private double lado;
	private static final String formato = "Quadrado";
	
	public Quadrado(double lado) {
		if (lado < 0) {
			throw new IllegalArgumentException("Entrada inválida. Dimensao negativa");
		}
		this.lado = lado;
	}

	public double getLado() {
		return this.lado;
	}
	
	@Override
	public double getArea() {
		return this.lado * this.lado;
	}

	@Override
	public String getFormato() {
		return Quadrado.formato;
	}

	@Override
	public String getDimensoes() {
		return "Lado: " + this.lado;
	}
}
