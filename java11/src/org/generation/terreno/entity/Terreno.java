package org.generation.terreno.entity;

public abstract class Terreno { //Una clase abstracta no puede instanciarse.
	private String nombreTerreno;
	private double largo;
	private double ancho;
	private String propietario;
	
	
	public Terreno(String nombreTerreno, double largo, double ancho, String propietario) {
		this.nombreTerreno = nombreTerreno;
		this.largo = largo;
		this.ancho = ancho;
		this.propietario = propietario;
	}
	
	/**
	 * Los métodos abstractos no tienen cuerpo, terminan con punto y coma.
	 * Debido a que el método abstracto, el padre, no ha definido el comportamiento
	 * se dice que la clase hija implementará el comportamiento, es decir, las subclases
	 * son responsables de la implementación.
	 * 
	 */
	public abstract String formaDeObtenerlo(); //Un método abstracto sólo puede existir en una clase abstracta


	public String getNombreTerreno() {
		return nombreTerreno;
	}


	public void setNombreTerreno(String nombreTerreno) {
		this.nombreTerreno = nombreTerreno;
	}


	public double getLargo() {
		return largo;
	}


	public void setLargo(double largo) {
		this.largo = largo;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public String getPropietario() {
		return propietario;
	}


	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Terreno [nombreTerreno=");
		builder.append(nombreTerreno);
		builder.append(", largo=");
		builder.append(largo);
		builder.append(", ancho=");
		builder.append(ancho);
		builder.append(", propietario=");
		builder.append(propietario);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
