
public class Quadrado implements Figuras2D {
	private double lado;
	private String cor; 
	
	public Quadrado(double lado, String cor) {
		this.lado = lado;
		this.cor = cor;
	}

	@Override
	public double calculaArea() {
		return lado * lado;
	}

	@Override
	public double calculaPerimetro() {
		return 4 * lado;
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
