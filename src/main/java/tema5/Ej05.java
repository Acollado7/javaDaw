package tema5;

import java.util.Scanner;

public class Ej05 {
    /*Implementa un programa que guarde en un array 10 números enteros que se leen por teclado.
        A continuación se recorre el array y calcula el número total de positivos, de negativos y de ceros.
        Calcula y muestra la media aritmética de los valores positivos y la de los valores negativos del array.
        Implementar métodos para:
        Leer valores por teclado y almacenarlos en el array. Se le pasará el array como parámetro y no devolverá nada.
        Contar positivos, se le pasará el array como parámetro y devolverá el número de positivos almacenados en el array.
        Contar negativos, se le pasará el array como parámetro y devolverá el número de negativos almacenados en el array.
        Contar ceros, se le pasará el array como parámetro y devolverá el número de ceros almacenados en el array.
        Mostrar array, se le pasará el array como parámetro y no devolverá nada, sólo imprimirá por pantalla el array.
        Calcular media positivos, se le pasará el array como parámetro y no devolverá nada, sólo imprimirá por pantalla la media aritmética de los positivos.
        Calcular media negativos, se le pasará el array como parámetro y no devolverá nada, sólo imprimirá por pantalla la media aritmética de los negativos.
*/
    public static void main(String[] args) {

        int[] list = new int[10];

        rellenarArray(list);

        System.out.println("La lista tiene " + comprobarPositivos(list) + " positivos");
        System.out.println("La lista tiene " + comprobarNegativos(list) + " negativos");
        System.out.println("La lista tiene " + comprobarCeros(list) + " ceros");

        System.out.println("");

        System.out.println("La lista es:");
        imprimirLista(list);
        System.out.println("");
        calcularMediaPositivos(list,comprobarPositivos(list));
        calcularMediaNegativos(list,comprobarNegativos(list));

    }

    public static void rellenarArray(int[] array) {

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            array[i] = entrada.nextInt();

        }

    }

    public static int comprobarPositivos(int[] array) {

        int numerosPositivos = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
                numerosPositivos++;
            }

        }

        return numerosPositivos;

    }

    public static int comprobarNegativos(int[] array) {

        int numerosNegativos = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                numerosNegativos++;
            }

        }

        return numerosNegativos;

    }

    public static int comprobarCeros(int[] array) {

        int ceros = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                ceros++;
            }

        }

        return ceros;

    }

    public static void imprimirLista(int[] lista) {

        for (int i = 0; i < lista.length; i++) {

            if (i != lista.length - 1) {
                System.out.print(lista[i] + ",");
            } else {
                System.out.print(lista[i]);
            }
        }

        System.out.println("");

    }

    public static void calcularMediaPositivos(int[] lista, int numeroPositivos) {

        int sumaPositivos = 0;

        double media = 0;
        for (int i = 0; i < lista.length; i++) {

            if (lista[i] > 0) {

                sumaPositivos += lista[i];

            }
        }

        media = (double) sumaPositivos / numeroPositivos;
        if (sumaPositivos != 0) {
            System.out.println("La media de positivos es: " + media);
        } else {
            System.out.println("No hay numeros positivos en la lista");
        }

    }

    public static void calcularMediaNegativos(int[] lista,int numeroNegativos) {

        int sumaNegativos = 0;

        double media = 0;
        for (int i = 0; i < lista.length; i++) {

            if (lista[i] < 0) {

                sumaNegativos += lista[i];

            }
        }

        media = (double) sumaNegativos / numeroNegativos;

        if (sumaNegativos != 0) {
            System.out.println("La media de positivos es: " + media);
        } else {
            System.out.println("No hay numeros negativos en la lista");
        }

    }
}