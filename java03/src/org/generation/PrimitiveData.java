package org.generation;

public class PrimitiveData {


	public static void main(String[] args) {
		/**Los datos primitivos no tienen atributos ni métodos, pero los valores envolventes sí. 
		 * Ej: short es primitivo 
		 * Short es envolvente del dato
		 * ----------------------------------------
		 * byte, short, int y long para valores enteros
		 * float y double son para valores de punto flotante
		 */
		
		//La variable de tipo byte almacena valores del -128 al +127
		
		byte datoTipoByte = 10;
		System.out.println("Tipo byte: " + datoTipoByte);
		
		//La variable short almacena valores de -32,768 al +32,767
		short datoTipoShort = 150;
		System.out.println("Short Max value: " + Short.MAX_VALUE); //.MAX_VALUE es un atributo
		System.out.println("Short Min value: " + Short.MIN_VALUE);
		
		//La variable int almacena valores de -2^31 al (+2^31-1)
		System.out.println("Int Máx value: " + Integer.MAX_VALUE);
		System.out.println("Int Min value: " + Integer.MIN_VALUE);
		
		//La variable long almacena valores de -2^63 al (+2^63-1)
		long datoTipoLong = 9223372036854775807L; //Se agrega una L al final del número sino lo considera como un int
		System.out.println("Long max value: " + Long.MAX_VALUE);
		System.out.println("Long min value: " + Long.MIN_VALUE);
		 
		//float almacena valores de punto flotante de 32 bits
		float datoTipoFloat = 2.58f; //se agreag una f al final para que no lo considere un double
		System.out.println("Float max value: " + Float.MAX_VALUE);
		System.out.println("Float min value: " + Float.MIN_VALUE);
		
		//double almacena valores de punto flotante de 64 bits
		double datoTipoDouble = 2.58; 
		System.out.println("double max value: " + Double.MAX_VALUE);
		System.out.println("double min value: " + Double.MIN_VALUE);
		
		//Variable booblean: true o false
		boolean datoTipoBoolean = true;

		// variable char almacena un caracter, es de 16 bits. Sólo acepta un caracter.
		char datoTipoChar = 'a'; //Cambia su valor dependiendo el caracter, mayúscula o minúscula.
		
		/**Los datos de tipo String son considerados OBJETOS.
		 * El valor null se puede establecer para los objetos.
		 */
		String datoTipoString = "Ya mero nos vamos";
		
		//Las literales numéricas se pueden separar con un guón bajo
		int miValor = 120_101_135;
		double miValorDouble = 12_234.34_22;
		
		//Representación de literales numéricas en hexadecimal 0x ej: 0x1a
		int miValHex = 0x1a; //26 decimal
		System.out.println("Valor de 0x1a: " + miValHex);
		//binarios 0b
		int miValBinary = 0b0001_1010; //26 decimal
		System.out.println("Valor de 0b0001_1010: " + miValBinary);
		
		//Conversión de tipos 
		byte coquita127ml = 100;
		int cocaLitro = coquita127ml;
		System.out.println("Cantidad de líquido en coca de 1 litro : " + cocaLitro);
		
		cocaLitro = 256;
		coquita127ml = (byte) cocaLitro; //Se está casteando el dato para que quepa el int en el byte
		System.out.println("Cantidad de líquido en coquita de 127ml: " + coquita127ml);
		
		/**
		 * Se utiliza notación cameCase para nombrar variables.
		 * 
		 * Para las variables que son constantes se recomienda el snake_case y mayúsculas. 
		 * Ejemplo:
		 * 	
		 * final int NUM_COHORTE = 18;
		 */
		
		/**
		 * Los operadores de comparación && y || sólo se pueden hacer con booleanos
		 */
		int edad = 22;
		boolean bandera = true && false; //es válido
		bandera = edad>18 && edad <30; //Es válido
		//bandera = edad && edad<30; //No es válido
		
		/**
		 * La conversión de string numéricos a números se realiza con: parseInt, parseFloat, parseDouble.
		 */
		String edadString = "22";
		edad = Integer.parseInt(edadString);
		System.out.println("La edad promedio es de: " + edad);
		
		/**
		 * Operadores lógicos &&, || y !
		 */
		int numMascotas = 2;
		boolean tieneMichis = true;
		boolean supMaxMascotas = numMascotas>10 || tieneMichis!= false;
		System.out.println("Supera Max de mascotas: " + supMaxMascotas);
		
		//Ejercicio:
		boolean x = true;
		boolean y = false;
		boolean z = true;
		System.out.println("El resultado de x || y || x && !z && !y : " + (x || y || x && !z && !y));
		
	}
}
