package com.company;

public class Ejercicio2 {

    public static void main(String[] args) {
      
        double precio = 142.5;
      
        double precioTotal = aplicarImpuesto(precio);
      
        System.out.println("PRECIO TOTAL + IVA: " + precioTotal);

    }
    //funcion que recibe el precio y devuelve el precio + IVA
    static double aplicarImpuesto(double precio){
      
        return precio * 1.21;
    }

}
