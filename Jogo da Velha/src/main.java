import javax.swing.JFrame;

public class main extends JFrame{

	public static void main(String[] args) {
		
		MenuPrincipal menu = new MenuPrincipal();
		menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
		menu.setSize(500, 500);
		menu.setVisible(true);
	}
}
