package org.generation.service;

import org.generation.repository.ConexionMySQL;
import org.generation.repository.IConexionDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service //significa que es la clase que contiene los métodos que harán lectura, escritura y actualización de los datos

public class RegistroService implements IRegistroService{
	
	//Este ya no se usa
	//private IConexionDB conexionDB = new ConexionMySQL();
	
	
	//SpringBoot buscará una instancia definida por algún estereotipo (@Service, @Repository)
	@Autowired
	@Qualifier("MongoDB") //Para definir con cuál base de datos se conectará 
	private IConexionDB conexionDB;

	@Override
	public String usoDB(String nombre) {
		
		return conexionDB.registrar(nombre);
	}
	

}
