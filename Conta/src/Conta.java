
public class Conta {
	private String nome;
	private double saldo;
	private static int numeroDeContas = 0;
	
	public Conta(String nome, double saldo) {
		this.nome = nome;
		if (saldo > 0) {
			this.saldo = saldo;
			Conta.numeroDeContas += 1;
		} else {
			throw new IllegalArgumentException("Saldo inicial negativo");
		}
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else
			throw new IllegalArgumentException("Valor inválido");
	}
	
	public void sacar(double valor) {
		if (this.saldo < valor) {
			throw new IllegalArgumentException("Saldo negativo");
		//} else (valor < 0) {
			//throw new IllegalArgumentException("Valor inválido");
		} else {
			this.saldo -= valor;
		}
	}
	
	public String getDados() {
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
