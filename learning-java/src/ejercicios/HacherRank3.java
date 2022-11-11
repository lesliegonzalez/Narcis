package ejercicios;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//Link ejercicio: https://www.hackerrank.com/challenges/one-month-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one
public class HacherRank3 {

	class Result {

	    /*
	     * Complete the 'plusMinus' function below.
	     *
	     * The function accepts INTEGER_ARRAY arr as parameter.
	     */

	    public static void plusMinus(List<Integer> arr) {
	    // Write your code here

	        double positivo = 0;
	        double negativo = 0;
	        double cero = 0;
	        int n = arr.size();
	        
	        for(int i=0; i<n; i++){
	            if(arr.get(i)>0) positivo++;
	            else if(arr.get(i)<0) negativo++;
	            else cero++;
	        }
	        
	        //String resultadoPos = String.format("%.6f", positivo/n);
	        //String resultadoNeg = String.format("%.6f", negativo/n);
	        //String resultadoCero = String.format("%.6f", cero/n);
	        
	        System.out.printf("%.6f%n", positivo/n);
	        System.out.printf("%.6f%n", negativo/n);
	        System.out.printf("%.6f%n", cero/n);
	    
	    }

	}

	public class Solution {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        Result.plusMinus(arr);

	        bufferedReader.close();
	    }
	}
}
