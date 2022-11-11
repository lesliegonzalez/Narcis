package org.generation.entity;

import java.util.HashMap;

public class Rockola {
	private String nombre;
	private int idCancion;
	private int creditoDisponibles;
	private HashMap<Integer, Cancion> canciones;
	
	{
		this.idCancion = 0;
		this.nombre = "";
		this.creditoDisponibles = 0;
		this.canciones = new HashMap<Integer, Cancion>();
	}
	
	
	public Rockola(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCanciones(Cancion cancion) { //Establecer una nueva canción
		canciones.put(++idCancion, cancion); //Se agrega la nueva canción a la colección
	}
	
	public HashMap<Integer, Cancion> getCanciones(){ //Retorna una colección
		return canciones;
	}
	
	public String listaCanciones() {
		StringBuilder builder = new StringBuilder();
		for(int idCancion: canciones.keySet())
			builder.append(String.format("%n%03d:%n%s", idCancion, canciones.get(idCancion))); //%n Salto de línea  \t Tabulador  %03d es para que rellene con 3 ceros si no hay decimal  %s Es de String

			return builder.toString();
	}
	
}
