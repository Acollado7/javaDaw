package utilities;

import java.util.Random;

public class Prueba {
    public static void main(String[] args) {
        Random rd = new Random();
        //Comprobamos el método leerEntero()

        System.out.println("Introduce un número entero");
        int numero = utilidades.leerEntero();

        System.out.println("El número introducido es: " + numero);

        //Comprobamos el método leerEntero(int min, int max)

        System.out.println("Introduce un número entero entre 1 y 10");
        numero = utilidades.leerEntero(1, 10);

        System.out.println("El número introducido es: " + numero);

        //Comprobamos el método comprobarEnteroRango(int numero, int min, int max)

        System.out.println("Comprobamos si el número 5 está entre 1 y 10");

        if (utilidades.comprobarEnteroRango(1, 1, 10)) {
            System.out.println("El número 5 está entre 1 y 10");
        }

        //Comprobamos el método generarAleatorioRango(int min, int max)

        System.out.println("Generamos un número aleatorio entre 1 y 10");

        System.out.println("El número aleatorio es: " + utilidades.generarAleatorioRango(1, 10));


    }

}
