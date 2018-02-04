public class BalancoTrimestral {
	
	public static void main(String[] args) {
		int gastosJaneiro = 15000, gastosFevereiro = 23000, gastosMarco = 17000;
		int gastoTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastoTrimestre / 3;
		System.out.println("Gasto total: " + gastoTrimestre);
		System.out.println("\nGasto medio: " +mediaMensal);
	}
}
		