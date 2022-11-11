package guiedani;

public class Cafe {

	String nombreProduc;
	String origen;
	String presentacion;
	String tostado;
	int tamañoGrs;
	double precio;
	static int numProduc;

	{ 
		numProduc++;
	}
	
	Cafe(String origen, String presentacion, String tostado){
		this.nombreProduc = "Café "+ origen+ " "+presentacion+ " tostado "+ tostado;
	}
	
	/**
	 * Descipción completa del café
	 * @param origen Estado donde se cultivó
	 * @param presentacion molido o en grano
	 * @param tostado oscuro, medio oscuro, medio, claro
	 * @param tamañoGrs en gramos
	 * @param precio en MXN
	 */
	Cafe(String origen, String presentacion, String tostado, int tamañoGrs, int precio){
		this(origen,presentacion,tostado);
		this.tamañoGrs = tamañoGrs;
		this.precio = precio;
	}
	
	String informacion() {
		return "El producto es: " + this.nombreProduc +
				". La bolsa es de " + this.tamañoGrs + "grs"+
				", su precio es de $" +this.precio + " pesos.";
	}

}

