package org.generation.test;

import org.generation.entity.*;

public class TestRockola {

	public static void main(String[] args) {

		Rockola cantinera = new Rockola("La cantinera");
		
		Cancion madness = new Cancion("madness",  "The 2nd law", "rock-indie");
		madness.addAutor(new Autor ("Dominic", "Howard")); //Otra forma de instanciar un nuevo autor sin asignarlo a una variable
		//madness.addAutor(new Autor ("Chris", "Wolstenholme"));
		madness.setDuracion(3.50);//Se ingresa la duración de la canción
		
		
		Cancion orpheus = new Cancion("Orpheus", "The dark and the light", "rock");
		orpheus.addAutor(new Autor ("Shawn", "James"));
		orpheus.addAutor(new Autor ("Jimmy", "Messer"));
		orpheus.setDuracion(3.58);
		
		Cancion cadaQue = new Cancion("Cada Que", "Fantasía Pop", "Pop");
		cadaQue.addAutor(new Autor ("Denisse", "Guerrero"));
		cadaQue.addAutor(new Autor ("Edgar", " Huerta "));
		cadaQue.setDuracion(3.00);

		Cancion rosaPastel = new Cancion("Rosa Pastel", "Dulce Beat", "Pop");
		rosaPastel.addAutor(new Autor ("Denisse", "Guerrero"));
		rosaPastel.addAutor(new Autor ("Edgar", " Huerta "));
		rosaPastel.setDuracion(3.00);

		cantinera.setCanciones(rosaPastel);
		cantinera.setCanciones(cadaQue);
		cantinera.setCanciones(orpheus);
		cantinera.setCanciones(madness);
		System.out.println(cantinera.listaCanciones());
		
		//Ejercicio:
		//Imprimir todas las canciones donde aparezca "Denisse Guerrero"
		//Las canciones que tendrían que salir son: Rosa Pastel y Cada que
		
	}

}
