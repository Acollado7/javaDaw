package tema5;

public class Ej06 {
    public static void main(String[] args) {
        //Hacer un programa que determine si dos arrays son iguales. Probarlo con los arrays
        // [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , [1,2,3] y [1,2,2]. Este ejercicio hay que hacerlo de dos formas:
        // la primera, usando la clase Arrays; la segunda, creando un método que vaya comparando los valores de los arrays
        // y devuelva true si todos son iguales o false en caso contrario.

        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {1,2,3,4};
        int[] array4 = {1,2,3};
        int[] array5 = {1,2,3};
        int[] array6 = {1,2,2};

        System.out.println("Comparando arrays 1 y 2: " + compararArrays(array1, array2));
        System.out.println("Comparando arrays 3 y 4: " + compararArrays(array3, array4));
        System.out.println("Comparando arrays 5 y 6: " + compararArrays(array5, array6));

    }

    public static boolean compararArrays(int[] array1, int[] array2) {
        boolean iguales = true;
        if (array1.length != array2.length) {
            iguales = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    iguales = false;
                }
            }
        }
        return iguales;
    }
}
