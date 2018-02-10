
public class Circulo implements Figuras2Dimensoes {
	private double raio;
	private static final String formato = "Circulo";
	
	public Circulo(double raio){
		if (raio < 0) {
			throw new IllegalArgumentException("Entrada inválida. Dimensao negativa");
		}
		this.raio = raio;
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	@Override
	public double getArea() {
		return Math.PI * this.raio * this.raio;
	}

	@Override
	public String getFormato() {
		return Circulo.formato;
	}

	@Override
	public String getDimensoes() {
		return "Raio: " + this.raio;
	}
}
