
public class Operario extends Empregado{
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String telefone, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereco, telefone, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public Operario() {
		super();
	}

	public double getValorProducao() {
		return valorProducao;
	}
	
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return this.salarioBase + this.valorProducao * this.comissao / 100;
	}
	
}
