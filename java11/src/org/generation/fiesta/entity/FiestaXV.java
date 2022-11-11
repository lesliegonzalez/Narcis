package org.generation.fiesta.entity;

public final class FiestaXV implements Fiesta, Vals { //Si agregamos final ya no permite que otras clases hereden de ella 
	
	private int numInvitados; //Atributo de instancia
	final static int EDAD_PERSONA = 15; //Atributo de la clase
	
	@Override
	public String invitarPersonas() {
		return "Se invita a la chaviza";
	}

	@Override
	public String comprarBotanas() {
		return "Armarse de paketaxo";
	}

	@Override
	public String comprarBebidas() {
		return "Comprar juguito y aguas locas";
	}

	@Override
	public String terminarFiesta() {
		return "Se termina a las 11pm";
	}

	@Override
	public String escogerChambelanes() {
		return "Que la quinceañera escoja a sus chambelanes";
	}

	@Override
	public String escogerMusica() {
		return "Música de la chaviza";
	}

	@Override
	public String escogerVestuario() {
		return "Se escoje el vestido";
	}
	
	@Override
	public String resumenFiesta() {
		return String.format("Resumen: %n%s %n%s %n%s %n%s %n%s %n%s %n%s",
				this.invitarPersonas(),
				this.comprarBotanas(),
				this.comprarBebidas(),
				this.escogerChambelanes(),
				this.escogerMusica(),
				this.escogerVestuario(),
				this.terminarFiesta());
	}

}
