import javax.swing.JOptionPane;

public class Teste {	
	public static void main(String[] args) {

		FiguraGeometrica[] colecao = new FiguraGeometrica[1]; // array de 5 figuras geometricas

		for(FiguraGeometrica figura : colecao) {
			figura = criaFigura();
		}

		JOptionPane.showMessageDialog(null, "Visualização das figuras criada: ");

		for(FiguraGeometrica figura : colecao) {
			JOptionPane.showMessageDialog(null, figura.getDimensoes() + figura.getFormato());
		}
	}


	private static FiguraGeometrica criaFigura() {

		String formato = pegaFormato();

		switch (formato)
		{
		case "Quadrado": return new Quadrado(pegaDimensao("lado do quadrado"));
		case "Circulo" : return new Circulo(pegaDimensao("raio do circulo"));
		case "Cubo"    : return new Cubo(pegaDimensao("lado do cubo"));
		case "Esfera"  : return new Esfera(pegaDimensao("raio da esfera"));
		default: return null;
		}
	}

	private static double pegaDimensao(String string) {

		String entrada;
		Double dimensao = null;

		do {
			entrada = JOptionPane.showInputDialog(null,"Digite o " + string);
			try {
				dimensao = Double.parseDouble(entrada);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada invália");
				return pegaDimensao(string); // Esse método se torna recursivo se a entrada for um letra. Necssário tirar essa condição o quanto antes
			}

		} while (dimensao < 0);

		return dimensao;
	}



	private static String pegaFormato() {
		String formato;

		do {
			formato = JOptionPane.showInputDialog(null, "Digite o formato da figura geometrica: ");
		} while (!(formato.equals("Quadrado") || formato.equals("Cubo") || formato.equals("Circulo") || formato.equals("Esfera")));

		return formato;
	}
}
