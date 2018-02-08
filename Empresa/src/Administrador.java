
public class Administrador extends Empregado{
	private double ajudaDeCusto;

	public Administrador(String nome, String endereco, String telefone, 
			double salarioBase, double imposto,	double ajudaDeCusto) {
		super(nome, endereco, telefone, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Administrador() {
		super();
	}
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	@Override
	public double calcularSalario() {
		return this.salarioBase - this.salarioBase * this.imposto + this.ajudaDeCusto;
	}
}
