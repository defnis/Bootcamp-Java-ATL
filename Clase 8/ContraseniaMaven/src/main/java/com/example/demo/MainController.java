package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {

    @GetMapping("/")
    public String primeraPrueba() {
        return "Hola Mundo";
    }

    private String generarPasswordAleatoria() {
        // Lógica para generar una contraseña aleatoria

        // Aquí puedes utilizar el código del ejercicio anterior para generar la contraseña

        return "passwordGenerada"; // Reemplaza esto con la contraseña generada
    }
}
