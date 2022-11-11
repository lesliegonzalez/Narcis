package org.generation;

public class Ciclos {

	public static void main(String[] args) {
		/**
		 * Sintáxis del ciclo for:
		 * 
		 * for (inicialización, comparación, expresiónFinal){
		 * 		instrucción;
		 * }
		 */
		
		for (int i = 0; i <= 10; i++)
			for (int j = 0; j <= 10; j++)
				System.out.println("Valor de i: " + i + " Valor de j: " + j);

		for (int i = 10; i >0; i--)
			System.out.println("Cuenta regresiva: " +i);
	}

}
