
public class Principal {
	public static void main(String[] args) {
		Conta conta1 = new Conta(8876, 999, "Rafael");
		Conta conta2 = new Conta(7654, 432, "Joao");
		System.out.println(conta1.pegaTodosDados());
		System.out.println(conta2.pegaTodosDados() + "\n");

		System.out.println(conta1.getSaldo());
		conta1.sacar(500);
		System.out.println(conta1.getSaldo());
		conta1.depositar(-876);
		System.out.println(conta1.getSaldo());

		System.out.println(conta1.getSaldo());
		conta1.depositar(500);
		System.out.println(conta1.getSaldo());
		conta1.sacar(-876);
		System.out.println(conta1.getSaldo());
		conta1.sacar(76);
		System.out.println(conta1.getSaldo());
	}
}
