package org.generation;

import org.generation.service.IRegistroService;
import org.generation.service.RegistroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02InjeccionDependenciasApplication implements CommandLineRunner{
	
	private static Logger LOG = LoggerFactory.getLogger(Spring02InjeccionDependenciasApplication.class);
	//private IRegistroService service = new RegistroService(); Ya no se necesita instanciar porque ya se usó @Service en RegistroService
	@Autowired
	private IRegistroService service;
	
	public static void main(String[] args) {
		SpringApplication.run(Spring02InjeccionDependenciasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Hola");
		
		//Todos los mensajes se imprimirán pero con un mejor formato en consola
		LOG.info("Hola con estilo");
		LOG.warn("Hola con warning :O ");
		LOG.error("Hola enojado .__. ");
		LOG.info(service.usoDB("Nefertiti"));
		
	}

}
