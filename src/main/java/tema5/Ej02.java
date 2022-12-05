package tema5;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        try {


        Scanner sc = new Scanner(System.in);

        //Escribe un programa para leer la altura de un número determinado de personas y calcular la altura media.


        // El número de personas se pide por teclado y debe ser entero un entero mayor que cero.


        // Posteriormente el programa irá pidiendo la altura, en cm, de cada una de las personas y las guardará en una estructura de almacenamiento.


        // Si la altura leída no es positiva, el programa la pasará a número positivo. También es necesario saber cuántas personas tienen una
        // altura superior a la media e inferior a la media.


        System.out.println("Introduce el número de personas: ");
        int numPersonas = sc.nextInt();

        int[] alturas = new int[numPersonas];

        int suma = 0;

        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Introduce la altura de la persona " + (i + 1) + ": ");
            alturas[i] = sc.nextInt();
            suma += alturas[i];
        }

        int media = suma / alturas.length;

        System.out.println("La altura media es: " + media);

        }catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");

        }

        

    }
}
