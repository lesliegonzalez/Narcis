package ejercicios;

import java.io.*;
import java.util.*;

public class HackerRank4 {

    public static void main(String[] args) {
    	

class Prime {
    int checkPrime(int... numbers) {
    	int entero = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                entero = num;
            }
        }
        return entero;
    }
    
    boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }     
}

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    		Prime prime = new Prime();
        int entero;
        int contador = 2;
        String salida = "";
        Scanner scr = new Scanner(System.in);
        
        try{
            entero = scr.nextInt();
        }catch(Exception e){
            entero = 0;
        }
        
        if (entero == 1) {
        		salida = "2";
        }else {
		    	while (contador <= entero) {
					if (prime.checkPrime(entero) != 0) {
		    			if (prime.checkPrime(contador) != 0) {
			    	        		if (prime.checkPrime(contador) == 2) {
			    	        			salida += prime.checkPrime(contador);
			    	        		}else {
			    	        			salida += " " + prime.checkPrime(contador);
			    	        		}
			    	        	}
			    	        	contador++;
		    		}else {
		    			salida = null;
		    		}
		    }
        }
        
        System.out.println(salida);	
        
    }
    
    

}
