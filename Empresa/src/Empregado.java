
public class Empregado extends Pessoa {
	protected double salarioBase;
	protected double imposto;
	
	public Empregado(String nome, String endereco, 
					 String telefone, double salarioBase, double imposto) {
		super(nome, endereco, telefone);
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public Empregado() {
		super();
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double calcularSalario() {
		return this.salarioBase - this.salarioBase * this.imposto;
	}	
}
