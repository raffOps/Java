import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TratadorDeEventos implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		switch (arg0.getActionCommand()) {
		case "Novo Jogo": break;
		case "Sair": break;
		}

	}

}
