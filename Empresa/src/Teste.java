
public class Teste {

	public static void main(String[] args) {
		Operario trabalhador1 = new Operario("Pedro", "9999", "POA", 1000, 10, 100, 50);
		
		System.out.println("Nome: " + trabalhador1.getNome() + "\tSalário: " + trabalhador1.calcularSalario());
	}
}
