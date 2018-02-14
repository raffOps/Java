package Jogo;

public class JogadorComputador implements Jogador {
	
	private static final String nome = "Computador";
	private final String simbolo;
	
	public JogadorComputador(String simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public String getSimbolo() {
		return this.simbolo;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

}
