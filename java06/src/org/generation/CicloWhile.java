package org.generation;

import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		/** 
		 * Sintaxis while:
		 * 
		 * 	while(condición){
		 * 		instrucciones;
		 * 	}
		 * 
		 */
		
		int contador = 0;
		//Para que lea de la consola
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n¿Quieres comer pan? (simon / nel)");
		//Leer respuesta del scanner
		String respuesta = (sc.next()).toLowerCase();
		while(respuesta.equals("simon")) {
			System.out.println("Llevas comiendo " + ++contador + " panes");
			
			if(contador >= 6)System.out.println("Ya párale, eres un gordo andante.");
			
			System.out.println("\n¿Quieres otro pancito? (simon / nel)");
			respuesta = (sc.next()).toLowerCase();
		}
		System.out.println("¡Ve al gym a bajar los pancitos!");
		
		/**
		 * Sintaxis do while:
		 * 
		 * 	do{
		 * 
		 * 	} while (condición);
		 */
		
		Scanner scPan = new Scanner(System.in);
		String resp;
		
		do {
			System.out.println("Llevas comiendo " + ++contador + " panes");
			System.out.print("\n¿Quieres otro pancito? (simon / nel)");
			resp = (scPan.next()).toLowerCase();
		} while (resp.equals("simon"));
		
		System.out.println("Bye, gordito.");
		
		//break, continue;
		boolean bandera = true;
		int numIteraciones = 10;
		while(bandera) {
			System.out.println(numIteraciones--); //Post decremento hace la iteración de 10 al 5. si tuviera un post incremento hace la iteración apartir del 10 hasta el max positivo, se pasa a los negativos, regresa al 0 y entonces realiza el break en el 5 
			if(numIteraciones == 5)break;
		};
		
	}

}
