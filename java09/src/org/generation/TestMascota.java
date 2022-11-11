package org.generation;

public class TestMascota {

	public static void main(String[] args) {

		/* Mascota narcis; 
		narcis = new Mascota(); 
		narcis.name = "Narcis"; 
		narcis.ageInYears = 3;
		narcis.sizeInCm = 40;
		narcis.tipo = "felino";
		*/
		/*harlem.ageInYears = 1;
		harlem.sizeInCm = 25;
		harlem.tipo = "felino"; */
		
		System.out.println("No. de mascotas: " + Mascota.numPets);
		Mascota narcis = new Mascota("Narcis", 3, 35); //Es la forma reducida de hacer lo de arriba
		narcis.type = "gato";
		
		var harlem = new Mascota("Harlem", 1, 30);//Crear una variable de tipo mascota y Se instancia la clase
		
		System.out.println("Uno de mis bebes gatunos "+ narcis.information());
		System.out.println("Mi otra bebé gatuna " +harlem.information());
		System.out.println("No. de mascotas: " + Mascota.numPets);
		
		Mascota alf = new Mascota();
		System.out.println("La casi mascota de Linda " +alf.information());
		
		Mascota tommy = new Mascota("Tommy");
		System.out.println("La mascota de a es " +tommy.information());
		
		System.out.println("No. de mascotas: " + Mascota.numPets);
		
	}

}
