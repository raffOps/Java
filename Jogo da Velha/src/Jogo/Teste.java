package Jogo;

import javax.swing.JFrame;

import interfaceMenu.MenuPrincipal;

public class Teste {

	public static void main(String[] args) {
		Tabuleiro menu = new Tabuleiro();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setSize(500, 500);
		menu.setVisible(true);
	}

}
