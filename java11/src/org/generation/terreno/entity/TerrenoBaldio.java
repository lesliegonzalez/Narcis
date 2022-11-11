package org.generation.terreno.entity;

public class TerrenoBaldio extends Terreno {

	public TerrenoBaldio(String nombreTerreno, double largo, double ancho, String propietario) {
		super(nombreTerreno, largo, ancho, propietario);
	}

	@Override
	public String formaDeObtenerlo() {
		return "Nadie lo quería porque está muy lejos";
	}

	
	
}
