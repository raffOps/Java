public class TesteConta{
	public static void main(String[] args){
		Conta MinhaConta1 = new Conta();
		MinhaConta1.saldo = 800;
		MinhaConta1.id = 7864;
		MinhaConta1.agencia = 9943;
		MinhaConta1.titular = "Rafael";
		
		Conta MinhaConta2 = new Conta();
		MinhaConta2.saldo = 700;
		MinhaConta2.id  = 9008;
		MinhaConta2.agencia = 9876;
		MinhaConta2.titular = "Pedro";
		
		System.out.println("Conta 1\nNome: " + MinhaConta1.titular + "\tSaldo: " + MinhaConta1.saldo);
		System.out.println("\nConta 2\nNome: " + MinhaConta2.titular + "\tSaldo: " + MinhaConta2.saldo);
		
		MinhaConta1.sacar(300);
		System.out.println("\nSacando dinheiro. Conta atualizada\nConta 1\nNome: " + MinhaConta1.titular + "\tSaldo: " + MinhaConta1.saldo);
		if(MinhaConta2.transferir(MinhaConta1, 8000)){
			System.out.println("\nTranferencia concluida com sucesso");
		} else{
			System.out.println("\nTranferencia nao realizada. Saldo insuficiente");
		}
		
		System.out.println("\nDados da MinhaConta1" + MinhaConta1.imprimeDados());
		
		System.out.println("\nDados da MinhaConta2" + MinhaConta2.imprimeDados());
	}
}
			