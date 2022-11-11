package org.generation.entity;

public class Division {

	public double divisionByCero(int a) {
		double div = 0;
		try {
			div = a/0;
		}
		catch(ArrayStoreException e){ //e significa error
			System.out.println("Estoy en ArrayStoreException");
			System.out.println(e.toString());
		}
		/*catch(ArithmeticException e){ 
			System.out.println("El programa no pudo realizar la división");
			System.out.println(e.toString());
		}*/
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Estoy en ArrayIndexOutOfBoundsException ");
			System.out.println(e.toString());
		}
		catch(Exception e){ 
			System.out.println("Estoy en Exception");
			//System.out.println(e.toString());
			e.printStackTrace(); //Otra forma de imprimir el error
		}
		finally {
			System.out.println("Estoy en el bloque finally");
		}
		
		return div;
	}
}
