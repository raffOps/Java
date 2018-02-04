
public class Conta {
	private int id, agencia;
	private double saldo;
	String titular;

	Conta(int idAux, int agenciaAux, String titularAux) {
		this.id = idAux;
		this.agencia = agenciaAux;
		this.titular = titularAux;
		this.saldo = 0;
	}

	public boolean sacar(double valor) {
		if (valor > this.saldo) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public boolean depositar(double valor) {
		if (valor < 0) {
			return false;
		} else {
			this.saldo += valor;
			return true;
		}
	}

	public boolean transferePara(double valor, Conta outraConta) {
		if (this.sacar(valor)) {
			outraConta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular_aux) {
		this.titular = titular_aux;
	}

	public int getId() {
		return this.id;
	}

	public int getAgencia(){
		return this.agencia;
	}

	public String pegaTodosDados() {
		return "\nTitular: " + this.titular + "\nAgencia: " + this.agencia + "\tId: " + this.id + "\nSaldo: "
				+ this.saldo;
	}

}
