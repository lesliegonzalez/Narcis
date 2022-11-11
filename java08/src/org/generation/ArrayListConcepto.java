package org.generation;

import java.util.ArrayList;

public class ArrayListConcepto {

	public static void main(String[] args) {

		/**
		 * Un List es una colleción ordenada, en la que se permiten elementos duplicados.
		 * Se basa en un array redimensionable que crece su tamaño según crece la colección de elementos.
		 * 
		 * Esta colección es la que mejor rendimiento tiene.
		 * 
		 * Sintáxis:
		 * 		ArrayList<object> varName;
		 */
		
		//Definimos una colección de tipo String
		//ArrayList<String> isbn = new ArrayList<String>();
		ArrayList<String> nombreLibros = new ArrayList<String>();
		
		//Agregamos valores al arreglo
		nombreLibros.add("Matilda");
		nombreLibros.add("Harry Potter");
		nombreLibros.add("El túnel");
		nombreLibros.add("El último deseo");
		nombreLibros.add("Psicoanalista");
		nombreLibros.add("Metafísica");
		System.out.println(nombreLibros);
		
		//Desplegamos el tamaño de la colección
		
		int size = nombreLibros.size();
		System.out.println("Total de libros: " + size);
		
		//Mostramos solamente el libro El túnel
		String elTunel = nombreLibros.get(2);
		System.out.println(elTunel);
		
		//Removemos un elemento de la colección
		nombreLibros.remove(4);
		//Iterar elementos de la colección
		for(int i=0; i< nombreLibros.size(); i++)
			System.out.println("Mi regalo de navidad es " + nombreLibros.get(i));
		
		for (String libro : nombreLibros) //Le llaman for avanzado
			System.out.println("Libro: " + libro);
		
		//Reemplazar un elemento de la colección
		nombreLibros.set(2, "El tunel, versión femenina");
		
		//Iterar la colección con forEach
		nombreLibros.forEach(libro -> System.out.println(libro));
		
	}

}
