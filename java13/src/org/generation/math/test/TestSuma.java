package org.generation.math.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.generation.math.Suma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestSuma {
	Suma suma;
	
	@BeforeEach
	void inicializar() {
		suma = new Suma();
	}

	@Test
	@DisplayName("Sumatoria de números positivos")
	void testSumaEntero() {
		assertEquals(10, suma.sumaEnteros(5, 5) );
	}
	
	@Test
	@DisplayName("Sumatoria de números negativos")
	void testSumaNegativo() {
		assertEquals(8, suma.sumaEnteros(-5, 8) );
	}
	
	@Test
	//@Disabled //Deshabilida esta prueba
	@DisplayName("Sumatoria de números de punto flotante")
	void testSumaFlotante() {
		assertEquals(10.5,(suma.sumaEnteros(5.3F, 5.2F)),0.01); //0.01 es una delta, que da un márgen positivo y negativo ya que float no es preciso
	}
	
	@Test
	@DisplayName("Verifica si la sumatoria es positiva")
	void inPositive() {
		assertTrue( suma.sumaEnteros(3, 5) > 0);
		// assertEquals(true, suma.sumaEnteros(3, 5) > 0 );  Otra forma de hacer la línea de arriba
	}
}
