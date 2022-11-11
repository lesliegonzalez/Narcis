package org.generation.test;

import org.generation.entity.Division;

public class TestTryCatch {

	public static void main(String[] args) {
		/**
		 * Una excepción es una situación inesperada durante la ejecución de un programa.
		 * 
		 * Tipos de excepciones:
		 * 
		 * 1) Checked exceptions o Excepciones que se heredad de la clase exception
		 * 	  Las excepciones de este tipo de tienen que declarar en la firma del método
		 * 	  o bien usar los bloques try-catch.
		 * 2) Unchecked Exceptions o Excepciones que se heredad de la clase RunTimeExceptions 
		 * 	  no se está oblicado a procesarlas.
		 * 	  Es opcional el uso de los bloques try-catch.
		 * 
		 * Las excepciones de tipo Error son arrojadas por la JVM.
		 * Estos son errores de los que no nos podemos recuperar.
		 * Por ejemplo: Un desbordamiento en la memoria.
		 * 
		 * El stacktrace de una excepción es el conjunto de mensajes de error desde el 
		 * origen del error hasta la última clase que recibe el error. 
		 * 
		 */

		
		Division div = new Division();
		
		System.out.println("El resultado es: "+div.divisionByCero(5));
		
		System.out.println("Este es el fin del programa");
		
		
	}

}
