package tema4.ejprueba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        //Clase main
        //Creamos un par de objetos y probamos la clase CalculosCuenta
        Scanner sc = new Scanner(System.in);

        Cuenta cuenta1 = new Cuenta("Alberto", "123456789", 1000, 0.5);
        Cuenta cuenta2 = new Cuenta("Juan", "987654321", 2000, 0.2);

        System.out.println("Cuenta 1: " + cuenta1);
        System.out.println("----------------------");
        System.out.println("Cuenta 2: " + cuenta2);
        System.out.println("----------------------");

        System.out.println("Ingresamos intereses en la cuenta 1");
        CalculosCuenta.ingresarIntereses(cuenta1);
        System.out.println("----------------------");
        System.out.println("Cuenta 1: " + cuenta1);
        System.out.println("----------------------");

        System.out.println("Ingresamos dinero en la cuenta 2");
        System.out.println("Cantidad a ingresar: ");
        double cantidad = sc.nextDouble();
        CalculosCuenta.ingresarDinero(cuenta2, cantidad);
        System.out.println("----------------------");
        System.out.println("Cuenta 2: " + cuenta2);
        System.out.println("----------------------");
        try {

            System.out.println("Retiramos dinero en la cuenta 1");
            System.out.println("Cantidad a retirar: ");
            cantidad = sc.nextDouble();
            CalculosCuenta.retirarDinero(cuenta1, cantidad);
            System.out.println("----------------------");

            System.out.println("Cuenta 1: " + cuenta1);
            System.out.println("----------------------");

            System.out.println("Retiramos dinero en la cuenta 2");
            System.out.println("Cantidad a retirar: ");
            cantidad = sc.nextDouble();
            CalculosCuenta.retirarDinero(cuenta2, cantidad);
            System.out.println("----------------------");
        } catch (InputMismatchException ime) {
            System.out.println("Error: " + ime.getMessage());


        }
    }
}
