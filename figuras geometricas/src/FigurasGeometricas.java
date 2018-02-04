
public class FigurasGeometricas {
	protected String formato;
	protected static int quantidadeFiguras = 0;
	
	public FigurasGeometricas(String formato) {
		this.formato = formato;
		FigurasGeometricas.quantidadeFiguras += 1;
	}

	public String getFormato() {
		return this.formato;
	}
	
	public float getArea() {
		return 0.0f; // Interprete como o pass do python. 
					 //	    Esse metodo sera reescrito nas subclasses de FigurasGeometricas
	}
}
	