import java.util.ArrayList;

public class FormatosGeometricosSuportados {
	private static final String[] formatos = {"Circulo", "Esfera", "Quadrado", "Cubo"};
	private static final ArrayList<String> listaDeFormatosSuportados = FormatosGeometricosSuportados.iniciaListaDosFormatosSuportados();
	
	private static ArrayList <String> iniciaListaDosFormatosSuportados() {
		
		ArrayList<String> colecaoDeFormatos = new ArrayList<String>();
		
		for (String formato : FormatosGeometricosSuportados.formatos) {
			colecaoDeFormatos.add(formato);
		}
		return colecaoDeFormatos;
	}
	
	public static ArrayList<String> getFormatosSuportados() {
		return listaDeFormatosSuportados;
	}
}
