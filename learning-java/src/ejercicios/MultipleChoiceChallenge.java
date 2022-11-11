package ejercicios;

import java.util.Scanner;

public class MultipleChoiceChallenge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Quién en la actriz que interpreta a Hermione Granjer?\n"
				+ "a) Natalie Portman\n"
				+ "b) Emma Watson\n"
				+ "c) Rebecca Ferguson.");
		String opcion = (sc.next()).toLowerCase();
		
		if(opcion.equals("a")) System.out.println("Ceeeeerca, pero ¡No!");
		if(opcion.equals("b")) System.out.println("¡Por supuesto que sí!");
		else if(opcion.equals("c")) System.out.println("Respuesta incorrecta");
		else System.out.println("Opción inválida");
		
		/*while() {
			System.out.println("Intenta de nuevo");
			if (opcion.equals("b")) {
				System.out.println("¡Por supuesto que sí!");
				break;
			}
			
		}*/
		
		

	}

}
