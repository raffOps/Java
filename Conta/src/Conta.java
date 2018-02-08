
public class Conta {
	private String nome;
	private double saldo;
	
	public Conta(String nome, double saldo) {
		this.nome = nome;
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}
	
	public Conta() {}
	
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else
			return false;
	}
	
	public boolean sacar(double valor) {
		if ((valor > 0) && (this.saldo > valor)) {
			this.saldo -= valor;
			return true;
		} else 
			return false;
	}
	
	public String imprimirExtrato() {
		return "Nome: " + this.nome + "    Saldo: " + this.saldo;
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
