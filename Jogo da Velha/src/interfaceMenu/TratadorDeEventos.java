package interfaceMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TratadorDeEventos implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch (arg0.getActionCommand()) {
		case "botao": System.out.println("kkmoimjoim");;
		case "Sair": System.exit(0);
		}
		
	}
		

}
