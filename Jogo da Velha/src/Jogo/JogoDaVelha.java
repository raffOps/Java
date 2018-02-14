package Jogo;

public class JogoDaVelha {
	
	private Jogador vezDoJogador;
	
	public JogoDaVelha(Jogador jogador1, Jogador jogador2, Tabuleiro tabuleiro) {
		this.vezDoJogador = jogador1;
	}
	
	public String getVezDoJogador() {
		return this.vezDoJogador.getSimbolo();
	}

}
