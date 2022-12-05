package tema5;

import java.util.Random;

public class Ej03 {
    public static void main(String[] args) {
        //Crea un array de doubles de tamaño 20. Usando los métodos de la clase Arrays:
        /*
        -Rellena el array con el valor 7.5 en todas sus posiciones.
        -Realiza una copia del array anterior en un nuevo array.
        -Imprime ambos arrays. No se usa clase Arrays
        -Compara ambos arrays, mostrando si son iguales.
        -Introduce el valor 6.3 en una posición aleatoria válida de uno de los arrays. No se usa clase Arrays
        -Imprime ambos arrays.
        -Vuelve a compararlos, indicando si son iguales o no.
*/

        Random rd = new Random();

        double[] array = new double[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = 7.5;
        }

        double[] array2 = new double[20];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = 7.5;
        }

        System.out.println("Array 1: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Array 2: ");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        boolean iguales = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
                iguales = false;
            }
        }

        if (iguales) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }

        int posicion = rd.nextInt(array.length);

        array[posicion] = 6.3;

        System.out.println("Array 1: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Array 2: ");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        iguales = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
                iguales = false;
            }
        }

        if (iguales) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }



    }
}
