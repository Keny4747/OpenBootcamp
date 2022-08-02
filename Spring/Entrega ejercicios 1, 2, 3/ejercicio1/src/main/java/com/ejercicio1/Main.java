package com.ejercicio1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Saludo saludo = (Saludo) context.getBean("saludando");

        String saludar = saludo.imprimirSaludo();
        System.out.println(saludar);

    }
}
