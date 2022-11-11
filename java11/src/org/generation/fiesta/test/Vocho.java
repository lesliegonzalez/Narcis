package org.generation.fiesta.test;

class Automovil{
	{ //Bloque de inicialización de instancia
		System.out.println("mensaje D");
	}
	
	public Automovil(){
		System.out.println("mensaje E");
	}
}


class Sedan extends Automovil{
	
	static{ //Bloque de inicialización de clase
		System.out.println("mensaje A");
	}
	
	public Sedan(){ //Método constructor de la clase
		System.out.println("mensaje G");
	}
	
	{
		System.out.println("mensaje F");
	}
	
	static{
		System.out.println("mensaje B");
	}
}



public class Vocho extends Sedan{

	public static void main(String[] args) {
		System.out.println("mensaje C");
		new Vocho(); //Instanciar la clase vocho
		System.out.println("mensaje H");
		
		
		
		
	}
}
