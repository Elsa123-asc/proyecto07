package es.santander.ascender.proyecto07;

import java.lang.annotation.Native;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  // va sobre la clase
public class Saludo {
    @GetMapping ( "/bienvenida Elsa a esta nueva aventura") // va sobre el metodo
    public String get (@RequestParam ("nombre") String nombre) {
        return "Hola" + nombre;
    }
}
