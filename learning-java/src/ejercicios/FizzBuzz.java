package ejercicios;

import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {
		
		//Resultado en arreglo
		ArrayList<String> fizzBuzz = new ArrayList<String>();
		
		for(int i = 1; i <= 20; i++) {
			if(i%3 == 0 && i%5 == 0) fizzBuzz.add(Integer.toString(i)+ " FizzBuzz");
			else if (i%3 == 0) fizzBuzz.add(Integer.toString(i)+ " Fizz");
			else if(i%5 == 0) fizzBuzz.add(Integer.toString(i)+ " Buzz");
			else fizzBuzz.add(Integer.toString(i)+ " ");
			
		}
		System.out.println(fizzBuzz);
		
		//Resultado por línea
		for(int i = 1; i <= 10; i++) {
			if(i%3 == 0 && i%5 == 0) System.out.println(i + " FizzBuzz");
			else if (i%3 == 0) System.out.println(i + " Fizz");
			else if(i%5 == 0) System.out.println(i + " Buzz");
			else System.out.println(i + " ");
		}
    }

}
