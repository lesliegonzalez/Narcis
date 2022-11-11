package org.generation.terreno.entity;

public class TerrenoConCasa extends Terreno {

	
	
	public TerrenoConCasa(String nombreTerreno, double largo, double ancho, String propietario) {
		super(nombreTerreno, largo, ancho, propietario);
	}

	@Override
	public String formaDeObtenerlo() {
		return "Heredado en vida como regalo";
	}

	
	
	
}
