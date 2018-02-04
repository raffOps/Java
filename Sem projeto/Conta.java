public class Conta{
	int id, agencia;
	double saldo;
	String titular;
	
	boolean sacar(double valor){
		if (valor > saldo){
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
		
	void depositar(double valor){
		this.saldo += valor;
	}
	
	boolean transferir(Conta destino, double valor){
		if(this.sacar(valor)){
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	String imprimeDados(){
		return "ID: " + this.id + "\nAgencia: " + this.agencia + "\nSaldo: " + this.saldo + "\nTitular: " + this.titular;
	}
}
					
			
		