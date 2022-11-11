package org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {

		/**
		 * Los arrelogs se definen con corchetes []
		 * Los corchetes pueden ir antes o después de la variable
		 * 
		 * 	int[] myArray; int myArray[];
		 * 
		 * Se debe asignar la cantidad de elementos que contendrá el arreglo.
		 * Una vez definido, el arreglo no puedo cambiar su tamaño
		 */
		
		
		String[] nombreColores = new String[3];
		int[] codigoColores = new int[3];
		
		//System.out.println(codigoColores);
		//System.out.println(nombreColores);
		
		/**
		 * Para acceder a un elemento, indicamos dentro del corchete indicamos el índice del dato.
		 * El primer elemento es el índice 0.
		 */
		
		
		nombreColores[0]= "Azul";
		codigoColores[0] = 0x0000ff; //RGB en hexadecimal. Se debe anotar el "0x" previo al valor hexadecimal para que java lo reconozca
		
		nombreColores[1] = "Amarillo";
		codigoColores[1] = 0xffff00;
		
		nombreColores[2] = "Negro";
		codigoColores[2] = 0x000000;
		
		//Iteramos los datos de un arreglo
		for(int i=0; i< nombreColores.length; i++) {
			System.out.println("El color fav es: " + nombreColores[i]);
			System.out.println("El código RGB del color es: " + codigoColores[i]);
			System.out.println("El código hexadecimal del color "+ nombreColores[i] +  " es: " + Integer.toHexString(codigoColores[i])); //Con este se ve el valor hexadecimal
		}
		
		//nombreColores[3] = "Verde"; //Error en tiempo de ejecución	
		
		/**
		 * Otra forma de inicializar un arreglo
		 */
		
		String frutas[] = {"naranja", "uva", "papaya", "manzana"};
		
		/**
		 * Para crear una matriz, se indica con doble [][], primero son filas y luego columnas
		 */
		
		String pasteles[][] = new String [3][4];
		
		pasteles[0][1] = "Moka";
		for(int i=0; i< pasteles.length; i++) {
			for(int j=0; j< pasteles[i].length; j++)
				System.out.println("fila: " + i + " Columna: " + j + " : " + pasteles[i][j]);
		}
	}

}
