package com.example.ejercicio1.controller;

import com.example.ejercicio1.entities.Laptop;
import com.example.ejercicio1.repository.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class LaptopController {

    //atributos
    private LaptopRepository laptopRepository;

    //constructor

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    //listar todas las laptops
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    //crear una nueva laptop en base de datos
    @RequestMapping(value = "/api/laptops", method = RequestMethod.POST)
    public Laptop create(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }
}
