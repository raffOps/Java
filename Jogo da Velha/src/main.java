import javax.swing.JFrame;
import javax.swing.JOptionPane;

import interfaceMenu.MenuPrincipal;

public class main {
	
		public static void main(String[] args) {
		
		MenuPrincipal menu = new MenuPrincipal();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setSize(500, 500);
		menu.setVisible(true);
	
		}
	}

	

