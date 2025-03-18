package com.example;

public class Main3 {

    public static void main(String[] args) {
        String hola = holaMensaje();
        System.out.println(hola);

        int resultado = sumaNumeros(2, 3);
        System.out.println("La suma de los números es: " + resultado);

        System.out.println("---------------------");

        // Sí se pueden invocar directamente los métodos, dentro del comando de impresión.
        System.out.println(holaMensaje());
        System.out.println("La suma de los números es: " + sumaNumeros(2, 3));
    }

    public static String holaMensaje(){
        return "Hola, bienvenido a Java !!  ";
    }

    public static int sumaNumeros(int num1, int num2){
        return num1 + num2;
    }

}
