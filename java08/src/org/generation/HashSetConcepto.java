package org.generation;

import java.util.HashSet;

public class HashSetConcepto {

	public static void main(String[] args) {

		/**
		 * Una colección de tipo SET es una colección no ordenada de elementos.
		 * No se permiten elementos duplicados. Por lo que cualquier elemento duplicado no se agregará.
		 */
		
		//Definimos una colección HashSet
		HashSet<String> paises = new HashSet<String>();//Los constructores son métodos y los métodos llevan paréntesis
		
		//Agregamos valores a la colección
		paises.add("México");
		paises.add("Alemania");
		paises.add("Yibuti");
		paises.add("Wakanda");
		paises.add("Yemen");
		paises.add("Genovia");
		paises.add("Alemania"); //Elemento ubicado
		
		System.out.println(paises);
		
		//Desplegamos el tamaño de la colección
		System.out.println("No. países: " + paises.size());
		
		//Verificar si un elemento existe en la colección
		boolean paisExistente = paises.contains("Yibuti");
		System.out.println("¿Existe Yibuti? " + paisExistente);
		
		//Remover un elemento
		paises.remove("Yibuti");
		System.out.println(paises);
		
		//Iterar la colección
		paises.forEach(pais -> System.out.println("Pais: " + pais));
		
	}

}
