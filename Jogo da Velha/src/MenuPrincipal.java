import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.AreaAveragingScaleFilter;

public class MenuPrincipal extends JFrame {
	
	private final JLabel textoInicial = new JLabel("Jogo da velha");
	private final BorderLayout layout = new BorderLayout();
	JPanel areaDosBotoes = new JPanel();
	private final JButton[] botoes = new JButton[2];
	private final ActionListener tratadorDeEventos = new TratadorDeEventos();
	
	public MenuPrincipal() {
		
		super("Jogo da Velha"); // Barra de titulo;
		this.setLayout(layout);
		
		botoes[0] = new JButton("Novo jogo");
		botoes[1] = new JButton("Sair");
		//TODO: MAIS OPÇÕES
		areaDosBotoes.setLayout(new GridLayout(1, botoes.length));
		for (JButton botao : botoes) {
			areaDosBotoes.add(botao);
			botao.addActionListener(tratadorDeEventos);
		}
		
		add(textoInicial, BorderLayout.NORTH);
		add(areaDosBotoes, BorderLayout.SOUTH);
	}	
}
