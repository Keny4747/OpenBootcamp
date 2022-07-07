package com.company;

public class Main {

    public static void main(String[] args) {

        CocheCRUDImpl cocheCrud = new CocheCRUDImpl();

        //llamado a cada uno de los métodos del objeto
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

    }


}
