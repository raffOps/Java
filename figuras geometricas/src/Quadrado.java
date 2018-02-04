
public class Quadrado extends FigurasGeometricas{
	private float lado;
	
	public Quadrado(float lado, String formato) {
		super(formato);
		this.lado = lado;
	}

	public float getLado() {
		return this.lado;
	}
	
	@Override
	public float getArea() {
		return this.lado * this.lado;
	}
}
