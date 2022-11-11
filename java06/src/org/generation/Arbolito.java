package org.generation;

import java.util.Scanner;

public class Arbolito {

	public static void main(String[] args) {

		System.out.println("Ingresa las filas del arbol:");
		Scanner teclado = new Scanner(System.in);
		int filas = teclado.nextInt();
		
		for(int i = 0; i < filas; i++) {
			String line = "";
			for(int o = filas - i; o > 0; o--){
				line += " ";
			}
			line += "*";
			for(int o = 0; o < i; o++) {
				line += "**";
			}
			System.out.println(line);
		}
		
		int grosorDelTronco = filas/2;
		if(grosorDelTronco%2 == 0) {
			grosorDelTronco += 1;
		} 
		int asteriscosUltimaLinea = (filas * 2) - 1;
		int espacios = (asteriscosUltimaLinea - grosorDelTronco) / 2 + 1;
		
		for(int i = 0; i < grosorDelTronco*.66; i++) {
			
			String tronco = "";
			for(int o = 0; o < espacios; o++) {
				tronco += " ";
			}
			for(int o = 0; o < grosorDelTronco; o++) {
				tronco += "*";
			}
			System.out.println(tronco);
		}

	}

}
