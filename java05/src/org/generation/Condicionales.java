package org.generation;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		/**
		 * La clase scanner nos permite realizar una lectura de la consola.
		 */
		/*Scanner myScan = new Scanner(System.in);
		System.out.print("Introcude tu nombre: ");
		
		//Entrada del usuario
		String name = myScan.nextLine();
		
		//Entradas numéricas
		System.out.print("\nIntroduce tu edad: ");
		int age = myScan.nextInt();
		
		//Entradas numéricas de tipo double
		System.out.println("\nIntroduce el salario deseado: ");
		double salary = myScan.nextDouble();
		
		System.out.print("\nTu nombre es: " + name + ", tu edad es: " + age + ". Tu salario deseado es: " + salary); // \n hace un salto de línea
		*/
		
		/**
		 * Sintaxis de condicional if
		 * 
		 * 	if(condición) instrucción;
		 * 
		 * 	if (condición) {
		 * 		instrucciones;
		 * 	}
		 */
		/*int numChelas = 5;
		boolean hayBotanita = true;
		numChelas++;
		numChelas+= 3;
		
		System.out.println("Bienvenido a la cantina \"la oficina\" ");
		if (numChelas>5 && !hayBotanita) System.out.println("Vete a dormir");
		else if(numChelas>8) {
			System.out.println("Momento de mandar mensajes");
			System.out.println("Todas las canciones son mis canciones");
		}
		else System.out.println("Fondo, fondo, fondo"); */
		
		
		//------------ Ejercicio ------------
		/*Scanner calificacion = new Scanner(System.in);
		System.out.print("\nEscribe la calificación entre 0 y 10: " );
		
		double valor = calificacion.nextDouble();
		if (valor >= 9 && valor <= 10) System.out.println("¡Felicidades! Obtuviste: A");
		else if(valor >= 8 && valor < 9) System.out.println("¡Excelente! Obtuviste: B");
		else if(valor >= 7 && valor < 8) System.out.println("¡Vas bien, seguro puedes mejorar! Obtuviste: C");
		else if(valor >= 6 && valor < 7) System.out.println("¡Debes ponerte a estudiar! Obtuviste: D");
		else if(valor >= 0 && valor < 6) System.out.println("¡Qué mal, reprobarás! Obtuviste: F");
		else System.out.println("Ni idea"); */
		
		/**
		 * Sintáxis swith:
		 * 
		 * 		switch (condición){
		 * 			case 1:
		 * 				instruccionesn;
		 * 				break;
		 * 			  ...
		 * 			default:
		 * 				instrucciones;
		 * 				break;
		 * 		}
		 */
		
		Scanner mes = new Scanner(System.in);
		System.out.print("\nEscribe el número de mes en curso: ");
		
		int mesEnCurso = mes.nextInt();
		String mesString = "";
		
		switch(mesEnCurso) {
		case 1: 
			mesString = "Enero";
			break;
		case 2:
			mesString = "Febrero";
			break;
		case 3: 
			mesString = "Marzo";
			break;
		case 4: 
			mesString = "Abril";
			break;
		case 5: 
			mesString = "Mayo";
			break;
		case 6: 
			mesString = "Junio";
			break;
		case 7: 
			mesString = "Julio";
			break;
		case 8: 
			mesString = "Agosto";
			break;
		case 9: 
			mesString = "Septiembre";
			break;
		case 10: 
			mesString = "Octubre";
			break;
		case 11: 
			mesString = "Noviembre";
			break;
		case 12: 
			mesString = "Diciembre";
			break;
		default :
			mesString = "Incorrecto";
		}
		System.out.println("El mes en curso es: " + mesString);
		
		String temporada = "";
		switch(mesString) {
		case "Diciembre", "Enero", "Febrero":
			temporada = "Invierno";
			break;
		case "Marzo", "Abril", "Mayo":
			temporada = "Primavera";
			break;
		case "Junio", "Julio", "Agosto":
			temporada = "Verano";
			break;
		case "Septiembre", "Octubre", "Noviembre":
			temporada = "Otoño";
			break;
		}
		System.out.println("Estamos en la temporada: " + temporada);
	}
}
