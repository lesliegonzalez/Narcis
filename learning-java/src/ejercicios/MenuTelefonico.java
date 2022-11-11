package ejercicios;

import java.util.Scanner;

public class MenuTelefonico {

	public static void main(String[] args) {
		/**
         * Comenzar con $10,000
         * 
         * Hacer un menú telefónico
         *  Opción 1: retirar dinero (restar la cantidad)
         *  Opción 2: hacer depósitos
         *              ¿Dónde deseo depositar?
         *              opción 1: cuenta de cheques (sumar la cantidad)
         *              opcion 2: tarjeta de crédito (restar la cantidad)
         *              opción 3: cuenta de terceros (restar la cantidad)
         *  Opción 3: estado de cuenta (indicar la cantidad)
         *  Opción 4: quejas (No te contestas y te cuesga la llamada)
         *  opción 7: hablar con un asesor
         *  Opción 9: salir del cajero
         *  Opción desconocida: indica el error y vuelve a preguntar,
         *                      Si se equivoca 3 veces seguidas, se cuelga la llamada.
         *  
         *  Indicar la cantidad final del cliente
         *   
         */
		
		
		
		Scanner scanResp = new Scanner(System.in);
		int opcion;		
		int cantidad = 0;
		int subOpcion;
		int error = 0;
		int saldo = 10000;
		boolean llamada = true;
		
		System.out.println("Bienvenido a MoneyDom");
		while(llamada) {
			System.out.print("\nPor favor, elija una opción:\n"
					+ "Opción 1: Retirar dinero\n"
					+ "Opción 2: Hacer depósitos\n"
					+ "Opción 3: Estado de cuenta\n"
					+ "Opción 4: Quejas\n"
					+ "opción 7: Hablar con un asesor\n"
					+ "Opción 9: Salir\n");
			opcion = scanResp.nextInt();
			
			switch(opcion) {
			case 1 : 
				System.out.print("\n¿Cuánto dinero desea retirar? ");
				cantidad = scanResp.nextInt();
				saldo -= cantidad;
				System.out.println("Saldo actual: $"+ saldo +" pesos");
				break;
			case 2 : 
				System.out.print("¿En qué cuenta desea depositar?\n"
						+ "Opción 1: cuenta de cheques\n"
						+ "Opción 2: tarjeta de crédito\n"
						+ "Opción 3: cuenta de terceros");
				subOpcion = scanResp.nextInt();
				if(subOpcion == 1) {
					System.out.print("¿Qué cantidad?");
					cantidad = scanResp.nextInt();
					saldo += cantidad;
					System.out.println("Saldo actual: $"+ saldo +" pesos");
				} else if(subOpcion == 2) {
					System.out.print("¿Qué cantidad?");
					cantidad = scanResp.nextInt();
					saldo -= cantidad;
					System.out.println("Saldo actual: $"+ saldo +" pesos");
				} else if(subOpcion == 3) {
					System.out.print("¿Qué cantidad?");
					cantidad = scanResp.nextInt();
					saldo -= cantidad;
					System.out.println("Saldo actual: $"+ saldo +" pesos");
				}else System.out.print("Opción inválida");
				break;
			case 3 : 
				System.out.print("Su saldo es de: $" + saldo + " pesos.");
				break;
			case 4 : 
				System.out.print("Un momento, por favor...\n"
						+ "Un momento, por favor...\n"
						+ "Un momento, por favor...\n"
						+ "Agradecemos su tiempo de espera. En este momento no podemos procesar su solicitud.");
				break;
			case 7 : 
				System.out.print("Transfiriendo con un asesor...\n Espere un momento, por favor.");
				System.out.print("Lo sentimos, en este momento todos nuestros operadores se encuentran ocupados");
				break;
			case 9 : 
				break;
			default :
				error++;
				System.out.print("Opción inválida\n");
				//System.out.println("Errores acumulados: "+ error);
			}
			if(opcion == 9) {
				System.out.println("Su saldo final es de: $"+ saldo +" pesos");
				System.out.print("Gracias por su preferencia. ¡Que tenga buen día!");
				break;
			}else if(error == 3) {
				System.out.println("Su saldo final es de: $"+ saldo +" pesos");
				System.out.print("Gracias por su preferencia. ¡Que tenga buen día!");
				break;
			}else if(error < 3 && (opcion >= 1 && opcion <= 4 || opcion == 7))
				error = 0;
			
		}

	}

}
