package tema3.EstructurasDeSeleccion;

import java.util.Scanner;

public class Ej01 {
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
    }

}
//Si introducimos el 15 nos dara el mensaje de que no es mayor de edad
//pero si introducimos el 18 o el 60 nos dara el mensaje de que es mayor de edad
//es decir que si es mayor o igual a 18 nos dara el mensaje de que es mayor de edad.
