package org.generation;

import java.util.Scanner;

public class Arbol {

	public static void main(String[] args) {
		// Acomodar arbolito para que quede centrado
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de filas de su arbolito: ");
        int hojas = 1;
        int altura = scan.nextInt();
        
        for(int i = 1; i <= altura; i++) {
            int espacio = altura - i;
            for(int j = 0; j < espacio; j++) System.out.print(" ");
            for(int k = 0; k < hojas; k++) System.out.print("*");
            System.out.println("");
            hojas+=2;
        }
        int traltura = 4;
        if (altura<6) traltura = 2;
        int tronco = altura/2 - 1;
        int espacio2 = (altura - 1) - (tronco/2);
        for(int l = 0; l < traltura; l++) {
            for(int m = 0; m < espacio2; m++) System.out.print(" ");
            for(int n = 0; n < tronco; n++) System.out.print("*");
            System.out.println("");
        }
        if(altura>5) {
            tronco += 4;
            espacio2 -= 2;
        } else {
            tronco += 2;
            espacio2 -= 1;
        }
        for(int o = 0; o < 2; o++) {
            for(int p = 0; p < espacio2; p++) System.out.print(" ");
            for(int q = 0; q < tronco; q++) System.out.print("*");
            System.out.println("");
        }
	}
}
