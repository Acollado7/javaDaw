package tema3.EstructurasDeSeleccion;

import java.util.Scanner;

public class Ej04 {/*
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
        }*/

    //reescribir el programa anterior pero usando un operador ternario

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad:");
        int edad = scanner.nextInt();
        String mensaje = (edad >= 18) ? "Es mayor de edad" : "No es mayor de edad";
        System.out.println(mensaje);
        System.out.print("mostrar la edad: ");
        System.out.println(edad);
    }
    }

