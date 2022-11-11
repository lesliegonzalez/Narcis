package org.generation.tacos.entity;

import java.util.ArrayList;

public class Taco {
	private String nombreTaco;
	private String tipoTortilla;
	private ArrayList<String> proteinas;
	private boolean tieneQueso;
	private double costo;
	private ArrayList<String> condimentos;
	
	{
		this.nombreTaco = "Taco";
		this.tipoTortilla = "maíz";
		this.proteinas = new ArrayList<String>();
		this.tieneQueso = false;
		this.costo = 0;
		this.condimentos = new ArrayList<String>();
	}
	
	public Taco(String nombreTaco, String tipoTortilla){
		this.nombreTaco = nombreTaco;
		this.tipoTortilla = tipoTortilla;
	}

	public String getTipoTortilla() {
		return tipoTortilla;
	}

	public void setTipoTortilla(String tipoTortilla) {
		this.tipoTortilla = tipoTortilla;
	}

	public ArrayList<String> getProteinas() {
		return proteinas;
	}

	public void setProteinas(ArrayList<String> proteinas) {
		this.proteinas = proteinas;
	}

	public boolean isTieneQueso() {
		return tieneQueso;
	}

	public void setTieneQueso(boolean tieneQueso) {
		this.tieneQueso = tieneQueso;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public ArrayList<String> getCondimentos() {
		return condimentos;
	}

	public void setCondimentos(ArrayList<String> condimentos) {
		this.condimentos = condimentos;
	}

	public String getNombreTaco() {
		return nombreTaco;
	}

	public String oferta() {
		return "No existe oferta para este taco";
	}
	
	public String oferta(String tiempo) { //Esta es sobrecarga de métodos
		return "No existe oferta por el día de " +tiempo;
	}
	
	public String oferta(String tiempo, int cantidad) {
		return null;
	}
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Taco [nombreTaco=");
		builder.append(nombreTaco);
		builder.append(", tipoTortilla=");
		builder.append(tipoTortilla);
		builder.append(", proteinas=");
		builder.append(proteinas);
		builder.append(", tieneQueso=");
		builder.append(tieneQueso);
		builder.append(", costo=");
		builder.append(costo);
		builder.append(", condimentos=");
		builder.append(condimentos);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
