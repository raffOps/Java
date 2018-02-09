
public class Esfera implements Figuras3Dimensoes {
	
	private double raio;
	private static final String formato = "Esfera";
	
	public Esfera(double raio) {
		if (raio < 0) {
			throw new IllegalArgumentException("Entrada inv�lida. Dimensao negativa");
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
		return 4 * Math.PI * Math.pow(this.raio, 3) / 3; // N�o sei se � essa a formula certa
	}
}
