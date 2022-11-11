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

//Link :https://www.hackerrank.com/challenges/one-month-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one
// EJERCICIO PLUS MINUS
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here

        int positivo = 0;
        int negativo = 0;
        int cero = 0;
        double totalDataInArr = arr.size();
        
        for(int value: arr){
            if(value>0) positivo++;
            else if(value<0) negativo++;
            else cero++;
        }
        
        //String resultadoPos = String.format("%.6f", positivo/n);
        //String resultadoNeg = String.format("%.6f", negativo/n);
        //String resultadoCero = String.format("%.6f", cero/n);
        
        System.out.printf("%.6f%n", positivo/totalDataInArr);
        System.out.printf("%.6f%n", negativo/totalDataInArr);
        System.out.printf("%.6f%n", cero/totalDataInArr);
    
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
