package com.example;

public class Main2 { // Clase Main

    static String variableNivelClase = "Esta es una variable de nivel CLASE"; // Variable GLOBAL

    public static void main(String[] args) { // Método 'main'
        imprimeMensaje("Mensaje personalizado en código");
        imprimeMensaje(variableNivelClase);
    }

    public static void imprimeMensaje(String mensaje){ // Método 
        System.out.println(mensaje);
    }

}
