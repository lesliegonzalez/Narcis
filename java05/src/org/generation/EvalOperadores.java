package org.generation;

public class EvalOperadores {

	public static void main(String[] args) {

		int a=8, b=3, c=-5;
        
        System.out.println("a+b+c : " + (a+b+c) );
        System.out.println("ab/c : " + (a*b/c) );
        System.out.println("(ac)%b : " + ( (a*c)%b) );
        System.out.println("2b+3(a-c) : " + ( 2*b+3*(a-c)) );
        System.out.println("a*(b/c) : " + (a*(b/c) ) );
        System.out.println( b/c ); //Obtenemos solo la parte entera
        System.out.println( (float)b/c ); //para obtener decimales
        System.out.println("a*(c%b) : " + (a*(c%b)) );
        System.out.println("a-b-c2 : " + (a-b-c*2) );

	}

}
