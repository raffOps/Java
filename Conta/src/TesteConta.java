import javax.swing.JOptionPane;

public class TesteConta {
	public static void main(String[] args) {
		Conta conta1 = null;

		conta1 = criaConta(conta1);
		mostraConta(conta1);
		depositaConta(conta1);
		mostraConta(conta1);
	}

	/**
	 * Inicia a setagem dos dados iniciais e faz o tratamento caso eles sejam inválidos. 
	 * Métodos set da classe Conta se tornam desnecessários por causa desse método.
	 * @param conta1 Objeto do tipo Conta
	 * @return Conta
	 * @see TesteConta#setaDadosDaConta()
	 */
	private static Conta criaConta(Conta conta1) {
		boolean continuar;
		do {
			try {
				continuar = true;
				conta1 = setaDadosDaConta();
			} catch (IllegalArgumentException erro) {
				JOptionPane.showMessageDialog(null, erro.getMessage());
				continuar = false;
			}
		} while (!continuar);
		
		JOptionPane.showMessageDialog(null, "Conta criada com sucesso");
		return conta1;
	}

	/**
	 * Seta os dados iniciais da conta solicitados para o usuario e manda eles para o construtor da classe Conta
	 * @param 
	 * @return Conta
	 */
	private static Conta setaDadosDaConta() {
		String nome, saldo; //variaveis a serem setadas no objeto conta1

		nome = JOptionPane.showInputDialog("Digite o nome do titular da conta " + (Conta.getQuantidadeDeContas() + 1));
		saldo = JOptionPane.showInputDialog("Digite o saldo inicial:"); 
		return new Conta(nome, Double.parseDouble(saldo)); // saldo é convertido pra double ao ser mandado pro construtor do objeto
	}

	/**
	 * Monstra os dados da conta na tela
	 * @param conta1 Objeto do tipo conta
	 * @see Conta#getDados()
	 */
	private static void mostraConta(Conta conta1) {
		JOptionPane.showMessageDialog(null, conta1.getDados());
	}

	/**
	 * Chama o métods depositar da classe Conta e mostra a sua execução na tela, fazendo o tratamento de falhas pertinente
	 * @param conta1
	 * @see Conta#depositar(double)
	 */
	private static void depositaConta(Conta conta1) {
		boolean continuar;
		String valor;

		do {
			continuar = true;
			valor = JOptionPane.showInputDialog("Digite o valor a ser depositado na conta de " + conta1.getNome());
			try {
				conta1.depositar(Double.parseDouble(valor));
			} catch (IllegalArgumentException erro) {
				JOptionPane.showMessageDialog(null, erro.getMessage());
				continuar = false;
			}
		} while (!continuar);

		JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso");
	}

}
