package com.example.ejercicio1;

import com.example.ejercicio1.entities.Laptop;
import com.example.ejercicio1.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio1Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Ejercicio1Application.class, args);
        LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

        Laptop laptop1 = new Laptop(null,"Asus", "xdfl-23", 3233.23,200);
        Laptop laptop2 = new Laptop(null,"HP", "FFDS-2", 4043.2,100);
        Laptop laptop3 = new Laptop(null,"Apple", "CVC2", 5003.3,300);

        laptopRepository.save(laptop1);
        laptopRepository.save(laptop2);
        laptopRepository.save(laptop3);


    }

}
