package org.generation.tacos.entity;

public class TacoPastor extends Taco{ //extends es para heredar de la clase Taco (padre)

	boolean conPinia;
	int nivelAdobo;
	boolean esDeTrompo;
	
	
	public TacoPastor(String nombreTaco, String tipoTortilla, boolean conPinia, int nivelAdobo, boolean esDeTrompo) {
		super(nombreTaco, tipoTortilla); //Invoca al constructor del nivel superior: clase Taco
		this.conPinia = conPinia;
		this.nivelAdobo = nivelAdobo;
		this.esDeTrompo = esDeTrompo;
	}


	@Override  //Sobreescritura de métodos de la clase padre
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TacoPastor [conPinia=");
		builder.append(conPinia);
		builder.append(", nivelAdobo=");
		builder.append(nivelAdobo);
		builder.append(", esDeTrompo=");
		builder.append(esDeTrompo);
		builder.append(super.toString());//Invoca el método toString de la clase padre : Taco
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public String oferta() {
		return "Tacos al pastor al 2x1";
	}
	
	@Override
	public String oferta(String tiempoOferta) {
		return "Tacos al pastor al 2x1 el día de " + tiempoOferta;
	}
	
	
	
	
}
