package com.company;

public class SmartDevice {
    String color;
    String marca;
    String modelo;
    double precio;
    int añoLanzamiento;

    public SmartDevice() {

    }

    public SmartDevice(String color, String marca, String modelo, double precio, int añoLanzamiento) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.añoLanzamiento = añoLanzamiento;
    }

    public static class SmartPhone extends SmartDevice {
        String sistemaOp;
        int almacenamiento;
        int bateria;

        public SmartPhone() {
            super();
        }

        public SmartPhone(String color, String marca, String modelo, double precio, int añoLanzamiento, String sistemaOp, int almacenamiento, int bateria) {
            super(color, marca, modelo, precio, añoLanzamiento);
            this.sistemaOp = sistemaOp;
            this.almacenamiento = almacenamiento;
            this.bateria = bateria;
        }

        @Override
        public String toString() {
            return "SmartPhone :\n" +
                    "color: " + color +
                    ", marca:" + marca +
                    ", modelo:" + modelo +
                    ", precio:" + precio +
                    ", año de lanzamiento:" + añoLanzamiento +
                    ", sistemaOp:" + sistemaOp +
                    ", almacenamiento:" + almacenamiento +
                    ", bateria:" + bateria +
                    '}';
        }
    }

    public static class SmartWatch extends SmartDevice {
        double peso;

        public SmartWatch() {
            super();
        }

        public SmartWatch(String color, String marca, String modelo, double precio, int añoLanzamiento, double peso) {
            super(color, marca, modelo, precio, añoLanzamiento);
            this.peso = peso;
        }

        @Override
        public String toString() {
            return "SmartWatch\n" +
                    "color:" + color +
                    ", marca:" + marca +
                    ", modelo:" + modelo +
                    ", precio:" + precio +
                    ", año de lanzamiento:" + añoLanzamiento +
                    ", peso:" + peso +
                    '}';
        }
    }

    public static void main(String[] args) {
        SmartWatch smartwatch = new SmartWatch("Azul", "Samsung", "Watch4", 403.23, 2019, 52.3);
        SmartPhone smartPhone = new SmartPhone("Azul", "Motorola", "g9 power", 800.30, 2020, "Android 11", 128, 5000);
        System.out.println(smartwatch);
        System.out.println(smartPhone);
    }
}
