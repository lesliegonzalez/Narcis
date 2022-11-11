package org.generation.entity;

public class Autor {
	//Al inicio estaban en default
	private String nombre;
	private String apellido;
	private String nacionalidad;
	
	{
		this.nombre = "";
		this.apellido = "";
		this.nacionalidad = "";
	}
	
	public Autor(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String nombreCompleto() {
		return this.nombre+ " "+ this.apellido;
	}
}
