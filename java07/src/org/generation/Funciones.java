package org.generation;

public class Funciones {

	public static void main(String[] args) {
		//Para hacer este llamado, primero se debe instanciar un objeto
		OperacionesMath operaciones = new OperacionesMath();
		entradaUsuario entradaUsusario = new entradaUsuario();
		
		
		operaciones.sumaEnterosSinRetorno(10, 50);
		
		int resultado = operaciones.sumaEnteros(50, 25);
		System.out.println("50 + 25 = " + resultado);
		
		
		while(entradaUsusario.entradaTeclado("¿Quieres continuar? (s/n)")== 's') {
			System.out.println("Estás dentro del ciclo while");
		}
		System.out.println("Termina la ejecución");
		
		
		
		//System.out.println("20 + 9 = " + operaciones.sumaEnteros(20, 9));
		
		/*System.out.println("Valor de PI * 2 = " + operaciones.piPorDos());
		
		
		//Para hacer este llamado es necesario que la clase sea static
		System.out.println("pi/2 = " + OperacionesMath.piEntreDos());
		System.out.println("pi/2 = " + operaciones.piEntreDos());*/
		//System.out.println("Pi*2 = " + Operaciones.Math.piPorDos());No es posible, ya que primero se debe instanciar
	}

}
