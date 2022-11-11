package org.generation.fiesta.test;

import java.util.ArrayList;
import java.util.List;

import org.generation.fiesta.entity.*;

public class TestFiesta {

	public static void main(String[] args) {
		
		Fiesta rubi = new FiestaXV();
		Fiesta fer = new DespedidaDeSoltera();
		Fiesta viernesCh18 = new FiestaTematica();
		
		List<Fiesta> organizadorFiestas = new ArrayList<Fiesta>();
		
		organizadorFiestas.add(rubi);
		organizadorFiestas.add(fer);
		organizadorFiestas.add(viernesCh18);
		
		organizadorFiestas.forEach(fiesta -> resumen(fiesta));
		
	}

	public static void resumen(Fiesta fiesta) {
		System.out.println("========== F I E S T A ===========");
		System.out.println(fiesta.resumenFiesta());
	}
}
