package Jogo;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JogoDaVelha extends JFrame{
	
	private static Jogador vezDoJogador;
	private final Jogador jogador1;
	private final Jogador jogador2;
	private Tabuleiro tabuleiro;
	private int quantidadeDeJogadas = 0;
	private boolean fimDoJogo = false;
	private Jogador vencedor;

	JPanel areaDosDetalhesDaPartida = new JPanel(new GridLayout(4,2));
	JPanel areaDoPlacar = new JPanel(new GridLayout(1,2));
	JPanel areaDoNomeDoJogo = new JPanel(new GridLayout(1,10));
	JPanel areaDoTabuleiro = new JPanel(new FlowLayout());
	
	public JogoDaVelha(Jogador jogador1, Jogador jogador2) {
		this.vezDoJogador = jogador1;
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.tabuleiro = new Tabuleiro();
		
		
	}
	
	public static String getVezDoJogador() {
		return JogoDaVelha.vezDoJogador.getSimbolo();
	}
	
	

}
