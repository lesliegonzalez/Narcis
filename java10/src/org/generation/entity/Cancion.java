package org.generation.entity;

import java.util.HashMap;

public class Cancion {
	//Atributos encapsulados
	private String nombre;
	private String album;
	private String genero;
	private double duracion;
	private HashMap<String, Autor> autores;
	
	{
		this.nombre = "";
		this.album = "";
		this.genero = "";
		this.duracion = 0;
		this.autores = new HashMap<String, Autor>();
	}
	
	
	public Cancion(String nombre, String album, String genero){
		this.nombre = nombre;
		this.album = album;
		this.genero = genero;
	}
	
	//Por lo general los métodos set y get se agregan después del método constructor
	
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	public double getDuracion() {
		return this.duracion;
	}
	
	public void addAutor(Autor autor) {
		autores.put(autor.nombreCompleto(), autor);	
	}
	
	public String getNombre() { //Para que de el nombre la de la canción en la rockola
		return this.nombre;
	}
	
	public String toString() {
		//return this.nombre +" "+ this.album;
		
		//Es un método mutable. Esta forma es más eficiente en el consumo en memoria. 
	    	StringBuilder builder = new StringBuilder();
	    	builder.append("Nombre: ");
	    	builder.append(this.nombre);
	    	builder.append("\nÁlbum: ");
	    	builder.append(this.album);
	    	builder.append("\nGénero: ");
	    	builder.append(this.genero);
	    	builder.append("\nDuración: ");
	    	builder.append(this.duracion);
	    	if (autores.size()>1)builder.append("\nAutores: ");
	    	else builder.append("\nAutor: ");
	    	for (Autor autor: autores.values()) { //Regresa el nombre de los autores
	    		builder.append("\n\t");
	    		builder.append(autor.nombreCompleto());
	    	}
	    	return builder.toString();   	
    }

	
}
