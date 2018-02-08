
public class Retangulo implements Figuras2D {
	private double base;
	private double altura;
	private String cor;

	public Retangulo(double base, double altura, String cor) {
		this.base = base;
		this.altura = altura;
		this.cor = cor;
	}

	@Override
	public double calculaArea() {
		return base * altura;
	}

	@Override
	public double calculaPerimetro() {
		return 2 * base + 2 * altura;
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
