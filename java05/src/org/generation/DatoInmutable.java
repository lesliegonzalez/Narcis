package org.generation;

public class DatoInmutable {

	public static void main(String[] args) {
		String nombre = "Eduardo";
		nombre = "Erick";
		String participante = "Eduardo";
		
		String personaCH18 = new String ("Eduardo");
		
		if(participante.equals(personaCH18)) //Con equals compara el contenido de  variables, es decir, que sean string y no su valor como objeto
			System.out.println("Es la misma persona"); 
		else
			System.out.println("Es otra persona");

	}

}
