package cl.duoc.ejemplo.microservicio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DefaultController {

    @PostMapping("/mensaje")
    public String mensaje() {

        System.out.println("Integración OK al backend");
        return "{\"mensaje\": \"Integración OK al backend\"}";
    }

    @PostMapping("/mensaje/{usuario}")
    public String mensaje(@PathVariable String usuario) {

        System.out.println("Integración OK al backend, usuario: " + usuario);
        return "{\"mensaje\": \"Integración OK al backend, usuario: " + usuario + "\"}";
    }
}
