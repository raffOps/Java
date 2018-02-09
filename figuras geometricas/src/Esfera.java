
public class Esfera implements Figuras3Dimensoes {
	
	private double raio;
	private static final String formato = "Esfera";
	
	public Esfera(double raio) {
		if (raio < 0) {
			throw new IllegalArgumentException("Entrada inválida. Dimensao negativa");
		}
		this.raio = raio;
	}

	@Override
	public String getFormato() {
		return this.formato;
	}

	@Override
	public String getDimensoes() {
		return "Raio: " + this.raio;
	}

	@Override
	public double getVolume() {
		return 4 * Math.PI * Math.pow(this.raio, 3) / 3; // Não sei se é essa a formula certa
	}
}
