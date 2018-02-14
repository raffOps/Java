package Jogo;

public class JogadorHumano implements Jogador {
	
	private final String nome;
	private final String simbolo;
	private int vitorias;

	JogadorHumano(String nome, String simbolo) {
		this.nome = nome;
		this.simbolo = simbolo;
		this.vitorias = 0;
	}
	
	@Override
	public String getSimbolo() {
		return this.simbolo;
	}

	@Override
	public String getNome() {
		return this.nome;
	}
	
	public int getVitorias() {
		return this.vitorias;
	}
	
	public void incrementaVitorias() {
		this.vitorias++;
	}
}
