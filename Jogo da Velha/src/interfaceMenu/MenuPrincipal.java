package interfaceMenu;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class MenuPrincipal extends JFrame {
	
	private final JLabel textoInicial = new JLabel("Jogo da velha");
	JPanel areaDosBotoes = new JPanel(new GridLayout());
	private JButton[] botoes = new JButton[2];
	private String opcao = "Nada selecionado";
	public boolean botao = false;

	public MenuPrincipal() {
		
		super("Jogo da Velha"); // Barra de titulo;		
		botoes[0] = new JButton("Novo Jogo");
		botoes[1] = new JButton("Sair");	
		//TODO: MAIS OPÇÕES
		areaDosBotoes.setLayout(new GridLayout(1, botoes.length));
		for (JButton botao : botoes) {
			areaDosBotoes.add(botao);
			botao.addActionListener(new TratadorDeEventos());
		add(textoInicial, BorderLayout.NORTH);
		add(areaDosBotoes, BorderLayout.SOUTH);
		}
	}
	
	
	private class TratadorDeEventos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			switch(arg0.getActionCommand()) {
			case "Novo Jogo" : 
				JOptionPane.showMessageDialog(null,"novo botão apertado"); break;
			case "Sair": 
				//menu.dispose();break;
			}
		}
		
	}
	
	public String getOpcao() {
		return this.opcao;
	}
	
	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}
	
	public void resetaBotao() {
		this.botao = false;
	}
}
