package org.generation;

public class Mascota { //hereda de una clase o implementa de una interfaz
	//fields (atributos)
	String name;
	double ageInYears;
	String type;
	int sizeInCm;
	//Atributos de clase
	static int numPets;
	
	//El bloque de inicialización de atributos de las instancias, son dos {}
	{
		this.type = "No definido";
		this.name = "";
		this.ageInYears = 0.1;
		this.sizeInCm = 0;
		numPets++; //Incrementa el número de mascotas creadas (una vez que se haya inicializado en TestMascota)
		//System.out.println("Se entra al bloque de inicialización de atributos");
	}
	 
	//Atributos de clase, tienen modificador static
	static {
		numPets = 0; //Inicializar el atributo de clase con 0 mascotas previas
	}
	
	
	/** Métodos constructores 
	 * Si no especifico un constructos, java genera el default (vacío)
	 * El nombre de un constuctor debe tener el mismo nombre de la clase
	 * Los métodos constructores no tienen retorno (return)
	 * 
	 * La sobrecarga de métodos es cuando existe más de un método con el mismo nombre, pero tienen
	 * diferentes parámetros de entrada.
	 */
	Mascota(){
		//Este es el constructor por default
		//Si ya tenemos un constructor con parámetros y queremos otro que esté vacío, hay que especificarlo.
	}
	
	/**
	 * Método para inicializar el nombre
	 * @param name nombre de la mascota
	 */
	Mascota(String name){
		this.name = "Super " + name;
	}
	
	/**
	 * Método para inicializar nombre, edad y tamaño
	 * @param name nombre de la mascota
	 * @param ageInYears edad en años
	 * @param sizeInCm tamaño en cm.
	 */
	Mascota(String name, double ageInYears, int sizeInCm){
		this(name); //Se llama al método constructor Mascota(String name)
		this.type = "animal"; //Se sobreescribe la inicialización que estaba en el bloque 
		this.ageInYears = ageInYears;
		this.sizeInCm = sizeInCm;
		
		
		//este es el método default de la clase
		//System.out.println("Se crea un objeto de tipo Mascota");
	}
	
	
	/**
	 * Métodos de la clase
	 * - Métodos sobrecargados
	 * - Métodos sobreescritos
	 */
	String information() {
		return "se llama "+this.name+
				", tiene "+ this.ageInYears+ " años, "+
				"  mide "+ this.sizeInCm + "cm."+
				" y es un: " + this.type;
	}
	
}

