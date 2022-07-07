package com.company;

public class Main {

    public static void main(String[] args) {

        CocheCRUDImpl cocheCrud = new CocheCRUDImpl();

        //llamado a cada uno de los métodos de los objetos
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

    }


}
