package org.generation.tacos.test;

import org.generation.tacos.entity.Taco;
import org.generation.tacos.entity.TacoPastor;

public class TestTaco {

	public static void main(String[] args) {

		Taco tacoGenérico = new Taco("Taco genérico", "Maíz");
		System.out.println(tacoGenérico);
		
		TacoPastor tacoPastor = new TacoPastor("Taco al pastor", "maíz", true, 3, false);
		System.out.println(tacoPastor);
		
		System.out.println("Oferta para taco al pastor: " + tacoPastor.oferta());
		System.out.println("Oferta para taco al pastor: " + tacoPastor.oferta("hoy"));
		
	}

}
