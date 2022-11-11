package org.generation.fiesta.entity;


/**
 * Una interface es una delcaración formal de un contrato, en la cual los métodos
 * no contienen implementación alguna, es similar a los métodos abstractos.
 * 
 * Una clase puede implementar muchas interfaces, aunque no tengan relación.
 * 
 * Las clases abstractas se deben utilizar para objetos que estén estrechamente
 * relacionados, mientras que las interfaces son más adecuadas para proporcionar una 
 * funcionalidad común a clases que no estén relacionadas entre sí.
 * 
 * Para los pad¿trones de diseño se suelen utilizar interfaces.
 */

public interface Fiesta {

	/**
	 * Los métodos de una interfaz ya son de tipo public y abstract
	 * y los atributos son de tipo final.
	 */
	
	String invitarPersonas();
	
	String comprarBotanas();
	
	String comprarBebidas();
	
	String terminarFiesta();
	
	String resumenFiesta();
}
