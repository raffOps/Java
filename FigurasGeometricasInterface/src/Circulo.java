
public class Circulo implements Figuras2D{

	private double raio;
	private String cor;
	
	Circulo(double raio, String cor) {
		this.raio = raio;
		this.cor = cor;
	}
	
	@Override
	public double calculaArea() {
		return 3.1415 * raio * raio;
	}

	@Override
	public double calculaPerimetro() {
		return 2 * 3.1415 * raio;
	}

	@Override
	public void mudaCor(String cor) {
		this.cor = cor;		
	}

	@Override
	public String pegaCor() {
		return this.cor;
	}
}
