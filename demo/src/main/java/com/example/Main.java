package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo Mundial !"); // Impresión a Pantalla (hard coded)
        Greeting saludo = new Greeting();   //  Instancia de la clase 'Greeting', con el objeto 'saludo'
        saludo.hola();           // Con el objeto 'saludo', podemos llamar al método 'hola'
    }
}