package org.generation.fiesta.entity;

public class DespedidaDeSoltera implements Fiesta {

	@Override
	public String invitarPersonas() {
		return "Invitar a las amigas de la novia";
	}

	@Override
	public String comprarBotanas() {
		return "Jícamas con chamoy";
	}

	@Override
	public String comprarBebidas() {
		return "cocteles";
	}

	@Override
	public String terminarFiesta() {
		return "¿Se puede terminar?";
	}

	@Override
	public final String resumenFiesta() { //Otras clases ya no podrán sobreescribir este método
		return String.format("Resumen: %n%s %n%s %n%s %n%s",
				this.invitarPersonas(),
				this.comprarBotanas(),
				this.comprarBebidas(),
				this.terminarFiesta());
	}
}
