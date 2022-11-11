package org.generation;

import java.util.Scanner;

public class entradaUsuario {

Scanner sc = new Scanner(System.in);
	
	/**
	 * Muestra la pregunta y espera la respuesta del usuario
	 * @param txtPregunta pregunta a mostrar al usuario
	 * @return el primer caracter de la respuesta
	 */
	char entradaTeclado(String txtPregunta) {
		System.out.print("\n"+txtPregunta);
		String respuesta = sc.next().toLowerCase();
		return respuesta.charAt(0); // "Respuesta".charAt(0) -> 'R'
		
	}

}
