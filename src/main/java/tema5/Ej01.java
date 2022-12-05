package tema5;

public class Ej01 {
    //Escribe un programa que muestre cada elemento de un array de enteros y sume todos sus elementos.
    // Instancia e inicializa el array en el programa, sin leer nada por teclado, con los siguientes valores {1, 2, 3, 4, 5, 6}.

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            suma += array[i];
        }

        System.out.println("La suma de los elementos del array es: " + suma);
    }
}
