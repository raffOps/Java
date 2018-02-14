package Jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tabuleiro extends JFrame {
	
	private final Icon quadranteVazio = new ImageIcon(getClass().getResource("quadranteVazio.png"));
	private final Icon quadranteQuadrado = new ImageIcon(getClass().getResource("quadranteBola.png"));
	private final Icon quadranteX = new ImageIcon(getClass().getResource("quadranteX.png"));
	
	private ArrayList<Quadrante> tabuleiro = new ArrayList<Quadrante>();
	//private final JogoDaVelha jogo;

	public Tabuleiro() {
		super();
		setLayout(new GridLayout(3,3));
		//this.jogo = jogo;
		for(int indice = 0; indice < 9; indice++) {
			Quadrante quadrante = new Quadrante(quadranteVazio, indice);
			quadrante.addActionListener(new TratadorDeEventosNoTabuleiro(quadrante));
			tabuleiro.add(quadrante);
			add(quadrante);
		}
	}
	
	
	private class TratadorDeEventosNoTabuleiro implements ActionListener{
		
		Quadrante quadranteSelecionado;

		public TratadorDeEventosNoTabuleiro(Quadrante quadranteSelecionado) {
			this.quadranteSelecionado = quadranteSelecionado;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(!(quadranteSelecionado.jaFoiSelecionado())) {
				quadranteSelecionado.setSelecionado(true);
				//switch() {
				/* case "quadranteQuadrado":*/ quadranteSelecionado.setIcon(quadranteQuadrado); 
				// case "quadranteX": quadranteSelecionado.setIcon(quadranteX);
				}
			else
				quadranteSelecionado.setIcon(quadranteX);
				
			}
		}
	}

	
	
	
