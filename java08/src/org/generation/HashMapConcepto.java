package org.generation;

import java.util.HashMap;

public class HashMapConcepto {

	public static void main(String[] args) {
		/**
		 * Una colección Map es una relación de llave(key)-valor
		 * que forma una especie de tabla de datos
		 */
		
		//Definir un tipo de colección HashMap
		//		<key, value>
		HashMap<Integer, String> amores = new HashMap<Integer, String>();

		//Agregamos valores a nuestra colección
		amores.put(221011, "Legolas");
		amores.put(201102, "Máximo Décimo Meridio");
		amores.put(991014, "Morpheus");
		amores.put(150821, "Eros");
		amores.put(221020, "Legolas");
		amores.put(220807, "Nicola");
		System.out.println(amores);
		
		//Desplegamos el tamaño de la colección
		System.out.println("No. amores: " + amores.size());
		
		//Mostramos el amor de Eros
		System.out.println("El amor de mi vida es: " +amores.get(150821));
		
		//Remover un elemento
		amores.remove(220807);
		System.out.println(amores);
		
		//Iterar los elementos
		for(int fechaConocernos : amores.keySet())
			System.out.println("El día " + fechaConocernos + " conocí a " + amores.get(fechaConocernos));
		
		//Iteramos sólo los valores
		for(String nombreAmor : amores.values())
			System.out.println("Una persona más a mi colección: " +nombreAmor);
		
		if(amores.containsValue("Eros"))
			System.out.println("Eres el amor de mi vida");
		
	}

}
