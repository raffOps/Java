import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {
	
	private static final int QUANTIDADE_DE_FIGURAS = 1;
	
	public static void main(String[] args) {

		FiguraGeometrica[] colecaoDeFiguras = new FiguraGeometrica[QUANTIDADE_DE_FIGURAS]; 
		
		for(int indice = 0; indice < QUANTIDADE_DE_FIGURAS; indice++) { // Não sei porque mas o for aprimorado não funciona aqui
			colecaoDeFiguras[indice] = criaFigura();
		}

		JOptionPane.showMessageDialog(null, "Visualização das figuras criada: ");

		for(FiguraGeometrica figura : colecaoDeFiguras) {
				JOptionPane.showMessageDialog(null, figura.getFormato() + " de " + 
						figura.getDimensoes());
		}
	}

	private static FiguraGeometrica criaFigura() {
		double dimensao = 0;
		boolean repetir = true;
		String formato = pegaFormato();
		
		do {
			try {
				dimensao = pegaDimensao() ;
				repetir = false; // Se chegar nessa linha é porque a exceção não foi levantada, logo o do while pode terminar
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um numero positivo seu idiota");
			}
		} while(repetir);
		
		switch (formato)
		{
		case "Quadrado": return new Quadrado(dimensao);
		case "Circulo" : return new Circulo(dimensao);
		case "Cubo"    : return new Cubo(dimensao);
		case "Esfera"  : return new Esfera(dimensao);
		default: return null;
		}
	}

	private static double pegaDimensao() throws NumberFormatException {
		
		String entrada;
		Double dimensao = null;

		do {
			entrada = JOptionPane.showInputDialog(null,"Digite a dimensão da figura");
			dimensao = Double.parseDouble(entrada);
		} while (dimensao < 0);

		return dimensao;
	}

	private static String pegaFormato() {

		String formato;
		ArrayList<String> listaDeFormatos = FormatosGeometricosSuportados.getFormatosSuportados();

		do {
			formato = JOptionPane.showInputDialog(null, "Digite o formato da figura geometrica"
					+ "\nFormatos suportados: " + listaDeFormatos.toString());
		} while (!(listaDeFormatos.contains(formato)));

		return formato;
	}
}
