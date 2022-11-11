package org.generation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorInicioMaven {

	@GetMapping("/saludo")// localhost:8080/saludo
	public String saludo() {
		return "Holi Crayoli desde Spring Boot con Maven";
	}
}
