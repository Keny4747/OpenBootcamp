package com.company;

public class Main {
    public static void main(String[] args) {
        int numeroEntero=0;
        double numeroDecimal=0;
        boolean flag = false;
        String cadena=null;

        Main.asignarValorImprimirDatos(numeroEntero,numeroDecimal,flag,cadena);

    }
    public static void asignarValorImprimirDatos(int numeroEntero, double numeroDecimal, boolean flag, String cadena){
        numeroEntero = 3;
        numeroDecimal= 3.43;
        if(numeroDecimal>0 && numeroEntero>0) {
            flag = true;
            cadena ="Los números tienen valores";
        }
      imprimirDatos(numeroEntero,numeroDecimal,flag,cadena);
    }
    public static void imprimirDatos(int numeroEntero, double nuermoDecimal, boolean flag, String cadena){
        System.out.println("DATO int: "+numeroEntero);
        System.out.println("DATO double: "+nuermoDecimal);
        System.out.println("DAto boolean: "+flag);
        System.out.println("DATO String: "+cadena);
    }
}
