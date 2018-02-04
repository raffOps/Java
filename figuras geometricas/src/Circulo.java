
public class Circulo extends FigurasGeometricas {
	private float raio;
	
	public Circulo(float raio, String formato){
		super(formato);
		this.raio = raio;
	}
	
	public float getRaio() {
		return this.raio;
	}
	
	@Override
	public float getArea() {
		return 3.1415f * this.raio * this.raio;
	}
}
