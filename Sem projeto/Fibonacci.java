public class Fibonacci{
	int primeiroSomador = 0;
	int segundoSomador = 1;
	int aux;
	
	int calculaFibonacci(int posicao){
		if (posicao == 1){
			return this.primeiroSomador;
		} else{
			this.aux = this.primeiroSomador;
			this.primeiroSomador = this.segundoSomador;
			this.segundoSomador += aux;

			return this.calculaFibonacci(posicao-1);
		}
	}
}
			
	