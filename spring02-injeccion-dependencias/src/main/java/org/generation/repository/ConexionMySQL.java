package org.generation.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Los esterotipos indican a SpringBoot que se va a crear un beam.
 * @Repository indica que esta clase es un acceso a datos de información
 *
 */
@Repository
@Qualifier("MySQL")
public class ConexionMySQL implements IConexionDB{

	@Override
	public String registrar(String nombre) {
		return "My SQL registra a " + nombre;
	}

}
