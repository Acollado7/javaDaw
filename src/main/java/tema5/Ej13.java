package tema5;

import java.util.Scanner;

public class Ej13 {
    /*
    * Escribir un programa que lea números enteros entre 1 y 20 desde teclado. Se debe
    *  generar un histograma con las frecuencias de cada entero en la secuencia.  Para
    * representar las barras del histograma hay que utilizar secuencias del carácter ‘*’.
    *  El programa finaliza al introducir un cero. Por ejemplo, la secuencia: 1, 1, 20, 1,
    *  2, 20, 3, 3, 3, 4, 4, 4, 5, 3 generaría la siguiente salida:
1: ***
2: *
3: ****
4: ***
5:
6:
7:
…
20:**
*/

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           //Creamos un array que cada vez que añadamos un numero diferente de 0 añada una posicion nueva para el numero añadido
              int[] array = new int[0];
                int numero = 0;
                int contador = 0;

                do {
                    System.out.println("Introduce un numero entre 1 y 20");
                    numero = sc.nextInt();
                    if (numero != 0) {
                        //Creamos un array auxiliar que tenga una posicion mas que el array original
                        int[] arrayAux = new int[array.length + 1];
                        //Copiamos el array original en el array auxiliar
                        for (int i = 0; i < array.length; i++) {
                            arrayAux[i] = array[i];
                        }
                        //Añadimos el numero al array auxiliar
                        arrayAux[arrayAux.length - 1] = numero;
                        //Copiamos el array auxiliar en el array original
                        array = arrayAux;
                    }

                } while (numero != 0);

                //Recorremos el array y vamos contando cuantas veces aparece cada numero

                for (int i = 1; i <= 20; i++) {
                    for (int j = 0; j < array.length; j++) {
                        if (array[j] == i) {
                            contador++;
                        }
                    }
                    System.out.print(i + ": ");
                    for (int j = 0; j < contador; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    contador = 0;
                }

                sc.close();


    }
}



