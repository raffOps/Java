
public class Teste {
	public static void main(String[] args) {
		Quadrado objeto1 = new Quadrado(3, "Quadrado");
		Circulo objeto2 = new Circulo(4, "Circulo");
		
		System.out.println("Objeto 1\nFormato: " + objeto1.getFormato() + 
							 "\tArea: " + objeto1.getArea());
		System.out.println("\nObjeto 2\nFormato: " + objeto2.getFormato() + 
				 			 "\tArea: " + objeto2.getArea());
		
		System.out.println("Quantidade de figuras: " + FigurasGeometricas.quantidadeFiguras);
	}
}
