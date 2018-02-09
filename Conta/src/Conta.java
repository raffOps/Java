
public class Conta {
	private final String nome;
	private double saldo;
	private static int numeroDeContas = 0;
	
	public Conta(String nome, double saldo) {
		this.nome = nome;
		if (saldo < 0) {
			throw new IllegalArgumentException("Entrada inválida. Saldo inicial negativo");
		}
		this.saldo = saldo;
		Conta.numeroDeContas += 1;
	}
	
	public void depositar(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Entrada inválida. Valor negativo");
		}
		this.saldo += valor;	
	}
	
	public void sacar(double valor) {
		if (this.saldo < valor) {
			throw new IllegalArgumentException("Entrada inválida. Saldo menor que o valor");
		} else if (valor < 0) {
			throw new IllegalArgumentException("Entrada inválida. Valor negativo");
		}
		this.saldo -= valor;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "    Saldo: " + this.saldo;
	}
	
	public static int getQuantidadeDeContas() {
		return Conta.numeroDeContas;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	/*public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		} else {
			throw new IllegalArgumentException("Valor negativo");
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}*/
}
