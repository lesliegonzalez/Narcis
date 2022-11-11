package org.generation;

import java.util.Scanner;

public class Pino {

	public static void main(String[] args) {
//Recibimos datos de entrada
        
        Scanner filas = new Scanner (System.in);
        System.out.println("Vamos a construír un pinito");
        System.out.println("\nIntroduce el número de filas de tu pino: ");
        int numFilas = filas.nextInt();
        //System.out.println(numFilas);
        
        //Controlamos el número de filas con un for
        for (int i = 1; i <= numFilas; i++ ) {
            //i representa el número de fila
            //Establecemos el numero de asteriscos por fila
            int asteriscos =(2*i-1);
            int espacios = numFilas - i;
            //Imprimimos un primer salto de línea
            System.out.println("");
            //luego un siclo for que va a imprimir los espacios y los asteriscos
            //Primero los espacios a la izquierda
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            //Luego los asteriscos
            for (int j = 1; j <= asteriscos; j++) { 
                //Imprimimos los asteriscos
                System.out.print("*");                
            }    
        }
        //Imprimimos el tronco
        //Para calcular los espacios al inicios del tronco se cañcuña así
        //Asteriscos en la última fila  menos tres, y todo eso entre 2
        System.out.println("");
        //Con este for externo controlo las filas del tronco, que es una variable fija:3
        for (int i = 1; i <= 2; i++) {
            //con estos for construyo el tronco a partir del número de atsriscos de la 
            //última fila, para que quede centrado
            int espaciosTronco = ((2*numFilas-1)-3)/2;
            //ponemos los espacios
            for (int j = 1; j <= espaciosTronco; j++) {
                System.out.print(" ");
            }
            //Ahora el tronco
            //Luego los asteriscos
            for (int j = 1; j <= 3; j++) { 
                //Imprimimos los asteriscos
                System.out.print("*");
            }
            System.out.println("");//Este es para que contruya la siguiente fila del tronco abajo
                                   //De lo contrario la imprime al lado

        }

	}

}
