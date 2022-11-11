package org.generation;

public class OperacionesMath {

	/**
	 * Sintaxis de las funciones:
	 * 
	 * <Modificador de acceso> <tipoRetorno> nombreMétodo <parámetros> {
	 * 		<cuerpo de la función>
	 * 		instrucciones;
	 * }
	 */
	
	/**
	 * Suma dos números enteros y envía el resultado en consola.
	 * @param a sumando 1
	 * @param b sumando 2
	 */
	public void sumaEnterosSinRetorno(int a, int b) {
		System.out.println("La suma de " + a + " y " +b+ " = " + (a+b));
	}
	
	
	/**
	 * Suma dos números enteros y retona el resultado
	 * @param a sumando 1
	 * @param b sumando 2
	 * @return resultado de a+b
	 */
	int sumaEnteros(int a, int b) {
		sumaEnterosSinRetorno(a, b);
		return a+b;
	}
	
	
	/**
	 * Vaor de PI por 2
	 * @return PI*2
	 */
	double piPorDos() {
		//No se necesita instanciar la clase Math
		return Math.PI*2;
	}
	
	
	/**
	 * Valor de PI entre 2
	 * @return pi/2
	 */
	static double piEntreDos() {
		return Math.PI/2;
	}
	
}
