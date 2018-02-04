public class ContaEncapsulamento{
	
	private int id, agencia;
	private double saldo;
	private String titular;
	
	ContaEncapsulamento(int id_aux, int agencia_aux, String titular_aux){
		this.id = id_aux;
		this.agencia = agencia_aux;
		this.titular = titular_aux;
		this.saldo = 0;
	}
	
	ContaEncapsulamento(int id_aux, int agencia_aux){
		this.id = id_aux;
		this.agencia = agencia_aux;
		this.titular = "Não informado";
		this.saldo = 0;
	}
	
	public boolean sacar(double valor){
		if((valor > this.saldo) || (valor < 0)){
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public boolean depositar(double valor){
		if(valor < 0){
			return false;
		} else {
			this.saldo += valor;
			return true;
		}
	}
	
	public boolean transferePara(double valor, ContaEncapsulamento outraConta){
		if(this.sacar(valor)){
			outraConta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public String getTitular(){
		return this.titular;
	}
	
	public void setTitular(String titular_aux){
		this.titular = titular_aux;
	}
	
	public int getId(){
		return this.id;
	}
	
	public int getAgencia(){
		return this.agencia;
	}
	
	public String pegaTodosDados(){
		return "\nTitular: " + this.titular + "\nAgencia: " + this.agencia + "\tId: " +  this.id + "\nSaldo: " + this.saldo;
	}
}
	
	
		
		
		
	