public class TestaFibonacci{
	public static void main(String[] args){		
		System.out.println("Numeros de fibonacci");
		for(int i=1; i<8;i++){
			Fibonacci fibonacci = new Fibonacci();
			System.out.println("Posicao " + i + ": " + fibonacci.calculaFibonacci(i));
		}
	}
}