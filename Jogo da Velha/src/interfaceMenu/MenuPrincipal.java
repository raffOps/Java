package interfaceMenu;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class MenuPrincipal extends JFrame {
	
	private final JLabel textoInicial = new JLabel("Jogo da velha");
	JPanel areaDosBotoes = new JPanel(new GridLayout());
	private JButton[] botoes = new JButton[2];
	private final ActionListener tratadorDeEventos = new TratadorDeEventos();
	
	public MenuPrincipal() {
		
		super("Jogo da Velha"); // Barra de titulo;
		//this.setLayout(layout);
		
		botoes[0] = new JButton("Novo Jogo");
		botoes[0].setName("botao");
		botoes[1] = new JButton("Sair");	
		//TODO: MAIS OPÇÕES
		areaDosBotoes.setLayout(new GridLayout(1, botoes.length));
		for (JButton botao : botoes) {
			areaDosBotoes.add(botao);
			botao.addActionListener(tratadorDeEventos);
		}
		add(textoInicial, BorderLayout.NORTH);
		add(areaDosBotoes, BorderLayout.SOUTH);
	}
}
