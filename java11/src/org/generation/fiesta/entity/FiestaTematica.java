package org.generation.fiesta.entity;

public class FiestaTematica extends DespedidaDeSoltera{

	@Override
	public String comprarBebidas() {
		return "Se dan bebidas sorpresa";
	}
	
	//No se puede sobreescribir porque el método está definido 
	//como final en la clase padre, de la que hereda.
//	@Override
//	public String resumenFiesta() {
//		return null;
//	}
	
	
	
}
