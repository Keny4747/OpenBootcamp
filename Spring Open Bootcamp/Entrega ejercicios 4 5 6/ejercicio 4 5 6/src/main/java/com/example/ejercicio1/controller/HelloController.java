package com.example.ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saludo")
    public String imprimirSaludo(){
        return "Hola, resolviendo el ejercicio 1";
    }
}
