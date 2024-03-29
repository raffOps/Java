
public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	Fornecedor(double valorCredito, double valorDvida, String nome, String endereco, String telefone){
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDvida;
	}
	
	Fornecedor() {}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
}
