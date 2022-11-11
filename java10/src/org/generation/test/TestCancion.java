package org.generation.test;

//import org.generation.entity.Autor;
//import org.generation.entity.Cancion;
import org.generation.entity.*; //Con el asterisco se importan todas las clases del paquete entity

public class TestCancion {

	public static void main(String[] args) {

		Cancion madness = new Cancion("madness",  "The 2nd law", "rock-indie");
		Autor MatthewBellamy = new Autor("Matthew", "Bellamy");
		madness.addAutor(MatthewBellamy);
		madness.addAutor(new Autor ("Dominic", "Howard")); //Otra forma de instanciar un nuevo autor sin asignarlo a una variable
		madness.addAutor(new Autor ("Chris", "Wolstenholme"));
		madness.setDuracion(3.50);//Se ingresa la duración de la canción
		System.out.println(madness);
	}

}
