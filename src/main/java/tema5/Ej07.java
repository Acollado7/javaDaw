package tema5;

import java.util.Random;
import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        //Escribir un programa que lea del teclado el tamaño de dos arrays de enteros (el mismo tamaño para los dos arrays).
        // El programa inicializará los arrays con números aleatorios entre 1 y 100. Existirá un método llamado multiplicar que
        // recibirá los dos arrays e irá multiplicando los elementos dos a dos, empezando por los elementos que ocupan la posición cero,
        // luego la uno, etc, guardando el resultado en otro array, que será devuelto por el método. Además existirá un método para imprimir
        // por pantalla los valores de los arrays.

        System.out.println("Introduce el tamaño de los arrays");
        int tam = sc.nextInt();
        int[] array1 = new int[tam];
        int[] array2 = new int[tam];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rd.nextInt(100);
            array2[i] = rd.nextInt(100);
        }

        int[] array3 = multiplicar(array1, array2);

        imprimirArray(array1);
        System.out.println("----------------");
        imprimirArray(array2);
        System.out.println("----------------");
        imprimirArray(array3);




    }



    public static int[] multiplicar(int[] array1, int[] array2){
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] * array2[i];
        }
        return array3;
    }
    public static void imprimirArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

