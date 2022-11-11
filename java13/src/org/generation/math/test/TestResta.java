package org.generation.math.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.generation.math.Resta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestResta {

	Resta resta;
	
	@BeforeEach
	void inicializar() {
		resta = new Resta();
	}
	
	@Test
	@DisplayName("Resta de números positivos")
	void testRestaEntero() {
		assertEquals(0, resta.restaEnteros(5, 5) );
	}
	
	@Test
	@DisplayName("Resta de números negativos")
	void testRestaDosNegativos() {
		assertEquals(3, resta.restaEnteros(-5, -8) );
	}
	
	@Test
	@DisplayName("Resta de números negativos")
	void testRestaNegativo() {
		assertEquals(-13, resta.restaEnteros(-5, 8) );
	}
	
	@Test
	@DisplayName("Resta de números de punto flotante")
	void testRestaFlotante() {
		assertEquals(0.1,(resta.restaEnteros(5.3F, 5.2F)),0.01);
	}
	
	@Test
	@DisplayName("Resta de números de punto flotante")
	void testRestaFlotanteNeg() {
		assertEquals(12.5,(resta.restaEnteros(5.3F, -7.2F)),0.01);
	}
	
	@Test
	@DisplayName("Verifica si la resta es positiva")
	void inPositive() {
		assertTrue( resta.restaEnteros(5, 3) > 0);
	}
}
