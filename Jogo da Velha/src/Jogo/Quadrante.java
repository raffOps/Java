package Jogo;
import javax.swing.JButton;
import javax.swing.Icon;

public class Quadrante extends JButton {

	private boolean selecionado = false;
	private int indice;

	public Quadrante(Icon arg0, int indice) {
		super(arg0);
		this.indice = indice;
	}
	
	public void setSelecionado(boolean selecao) {
		this.selecionado = selecao;
	}
	
	public boolean jaFoiSelecionado() {
		return this.selecionado;
	}
	
	public int getIndice() {
		return this.indice;
	}
}
