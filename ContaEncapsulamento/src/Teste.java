import java.util.Scanner;
import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Objeto que pega dados do teclado	
		String mensagem; // variaveis auxiliar
		Conta conta1 = new Conta();
		
		//CRIACAO
		// Pega os dados da conta
		conta1.setNome(JOptionPane.showInputDialog("Digite o nome da conta 1"));
		mensagem = JOptionPane.showInputDialog("Digite o saldo da conta " + conta1.getNome());
		conta1.setSaldo(Double.parseDouble(mensagem));
				
		// Mostra os dados da conta
		JOptionPane.showMessageDialog(null, conta1.imprimirExtrato());
		
		//DEPOSITO
		// Deposita um valor na conta e mostra uma mensagem se operação foi realizado com sucesso
		mensagem = JOptionPane.showInputDialog("Digite a quantia a ser depositada");
		if (conta1.depositar(Double.parseDouble(mensagem))) {
			mensagem = "Valor válido";
		} else {
			mensagem = "Valor inválido";
		}
		JOptionPane.showMessageDialog(null, mensagem);
		
		// Mostra os dados da conta
		JOptionPane.showMessageDialog(null, conta1.imprimirExtrato());
		
		//SAQUE
		// Saca um valor da conta e mostra uma mensagem se operação foi realizado com sucesso
		mensagem = JOptionPane.showInputDialog("Digite a quantia a ser sacada da conta 1: ");
		
		if (conta1.sacar(Double.parseDouble(mensagem))) {
			mensagem = "Valor válido";
		} else {
			mensagem = "Valor inválido";
		}
		JOptionPane.showMessageDialog(null, mensagem);
				
		// Mostra os dados da conta
		JOptionPane.showMessageDialog(null, conta1.imprimirExtrato());
	}
}
