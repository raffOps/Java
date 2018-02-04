public class Fatorial{
	public static void main(String[] args){
		int fatorial = 10, resultado = 1 ;
		for(int i = 1; i <= fatorial; i++){
			resultado = resultado * i;
			System.out.println("Fatorial de " + i + ": " + resultado);
		}
	}
}