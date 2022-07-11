package com.company;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        //Texto al reves:
        Scanner sc = new Scanner(System.in);
        System.out.println("======Texto al reves=================");
        System.out.println("Digitar el texto: ");
        String texto = sc.nextLine();

        String cadena = Reverse(texto);
        System.out.println(cadena);

        //1.Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        System.out.println("======Array Unidimensional=================");
        String[] vCadenas = {"Maria", "José", "Jaime", "Carlos", "Pedro", "Joel"};
        for (String c : vCadenas) {
            System.out.println(c);
        }

        //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de
        // cada elemento en ambas dimensiones.
        System.out.println("======Array Bidimensional=================");
        Integer[][] numeros = {
                {15, 13, 96, 4, 10},
                {20, 1, 9, 11, 2017}
        };

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {

                System.out.println("Fila: " + (i + 1) + " | Columna: " + (j + 1) +
                        "\nEl valor es: " + numeros[i][j] + "\n");
            }
        }

        //3.Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento
        // y muestra el resultado final.
        System.out.println("======vector=================");
        Vector<Persona> personas = new Vector<>();

        personas.add(new Persona(3234, "jose", "Gomez", 23));
        personas.add(new Persona(3234, "Maria", "Rdgriguez", 34));
        personas.add(new Persona(3234, "Jaime", "Garcia", 22));
        personas.add(new Persona(3234, "Kevin", "montes", 15));

        System.out.println("Vector antes de borrar elementos");
        for (Persona p : personas) {
            System.out.println(p.codigo + " " + p.nombre + " " + p.apellido + " " + p.edad);
        }

        personas.remove(3);
        personas.remove(2);
        System.out.println("Vector despues de borrar elementos");
        for (Persona p : personas) {
            System.out.println(p.codigo + " " + p.nombre + " " + p.apellido + " " + p.edad);
        }

        //4.Indica cuál es el problema de utilizar un Vector con la capacidad
        // por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        //RPTA: con la capacidad inicial por defecto (10) se origina un desperdicio de memoria ya
        //esta se va duplicando constantemente al sobrepasar el tamaña establecido

        //5.Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.
        System.out.println("======ArrayList y LinkedList=================");
        ArrayList<String> listaOficina = new ArrayList<>();
        listaOficina.add("Escritorio");
        listaOficina.add("Impresora");
        listaOficina.add("Cafetera");
        listaOficina.add("Laptop");

        LinkedList<String> copiaLista = new LinkedList<>(listaOficina);

        System.out.println("ArrayList:");
        for (String lo : listaOficina) {
            System.out.println(lo);
        }
        System.out.println("LinkedList:");
        for (String lo : copiaLista) {
            System.out.println(lo);
        }

        //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        // con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList
        // final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        System.out.println("======ArrayList INTEGER=================");
        ArrayList<Integer> enteros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            enteros.add(i + 1);
        }

        for (int i = 0; i < enteros.size(); i++) {
            if (enteros.get(i) % 2 == 0) {
                enteros.remove(i);
            }
        }
        for (Integer e : enteros) {
            System.out.print(e + " ");
        }

        //7.Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su
        // llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
        // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        // Finalmente, mostraremos en cualquier caso: "Demo de código".
        System.out.println("======EXCEPTION=================");
        try {
            int division = DividePorCero(2, 0);
            System.out.println("Resultado: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }
        //8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en
        // "fileOut".

        System.out.println("Introduce el fichero de origen: ");
        String fileIn = sc.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String fileOut = sc.nextLine();
        copiar(fileIn, fileOut);
    }

    public static int DividePorCero(int dividendo, int divisor) throws ArithmeticException {
        return dividendo / divisor;
    }

    public static String Reverse(String texto) {

        StringBuilder str = new StringBuilder(texto);
        return str.reverse().toString();

    }
    private static void copiar(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }

}
