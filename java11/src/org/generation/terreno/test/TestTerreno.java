package org.generation.terreno.test;

import java.util.ArrayList;
import java.util.List;

import org.generation.terreno.entity.Terreno;
import org.generation.terreno.entity.TerrenoBaldio;
import org.generation.terreno.entity.TerrenoConCasa;

public class TestTerreno {

	public static void main(String[] args) {

		/**
		 * No se puede instanciar esto porque Terreno es una clase abstracta
		 */
		//Terreno miNavidad = new Terreno("El terrenito de la abuela", 25, 35, "La abuela");
		//System.out.println(miNavidad);
		
		
		//Se recomienda hacer las variables de la clase padre e instanciarlas como clase hijo
		Terreno miNavidad = new TerrenoConCasa("El terrenito de la abuela", 20, 40, "La abuela");
		System.out.println(miNavidad);
		System.out.println(miNavidad.formaDeObtenerlo());
		
		Terreno peorEsNada = new TerrenoBaldio("Peor es nada", 40, 80, "La suegra");
		System.out.println(peorEsNada);
		System.out.println(peorEsNada.formaDeObtenerlo());
		
		/*
		peorEsNada = new TerrenoConCasa("Mi rancho", 40, 80, "Se lo compré a Sergio");
		System.out.println(peorEsNada);
		System.out.println(peorEsNada.formaDeObtenerlo()); */
		
		List<Terreno> misTerrenitos;
		misTerrenitos = new ArrayList<Terreno>();
		
		misTerrenitos.add(peorEsNada);
		misTerrenitos.add(miNavidad);
		
		
		System.out.println("----------- Cómo obtuve mis Terrenitos -------------");
		misTerrenitos.forEach(terreno -> System.out.println(terreno.formaDeObtenerlo()));
		
		//System.out.println("Mis terrenitos son: " +misTerrenitos);
		
		
	}

}
