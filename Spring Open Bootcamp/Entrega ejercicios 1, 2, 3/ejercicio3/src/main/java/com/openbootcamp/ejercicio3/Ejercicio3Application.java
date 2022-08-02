package com.openbootcamp.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Ejercicio3Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApplicationContext context = SpringApplication.run(Ejercicio3Application.class);

        ArtistaRepository repository = context.getBean(ArtistaRepository.class);


        int opcion;
        do {
            System.out.println("===============REGISTRO BASICO DE ARTISTAS=========");
            System.out.println("MENU PRINCIPAL:\n" +
                    "[1] Registrar\n" +
                    "[2] Cantidad de registros en BD\n" +
                    "[3] Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Artista artista = registrar();
                    repository.save(artista);
                    System.out.println("artista guardado");
                    break;
                case 2:
                    System.out.println("El número de artiscar en base de datos es: " + repository.count());
                    break;
                case 3:
                    System.out.println("Vuelve pronto!");
                    break;
            }
        } while (opcion != 3);

        sc.close();
    }

    public static Artista registrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del artista: ");
        String nombre = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();

        Artista artista = new Artista(null, nombre, edad);

        return artista;

    }


}
