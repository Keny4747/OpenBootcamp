package com.company;

public class Ejercicio2 {

    public static void main(String[] args) {
      
        double precio = 142.5;
      
        double precioTotal = aplicarImpuesto(precio);
      
        System.out.println("PRECIO TOTAL + IVA: " + precioTotal);

    }
    
     /**
     * funcion que aplica el impuesto
     * @param precio del producto
     * @return precio tatal mas IVA redondeado a dos decimales
     */
    static double aplicarImpuesto(double precio) {
        return Math.round(precio * 1.21) ;
    }

}
