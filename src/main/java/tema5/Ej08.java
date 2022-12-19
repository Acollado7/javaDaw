package tema5;

public class Ej08 {
    //Realizar un programa que lea de la entrada un número y utilice ese
    // número para crear un array de enteros de ese tamaño. A continuación,
    // el programa inicializa el array con los valores que el usuario introduzca
    // por teclado. Finalmente, se deberá recorrer el array e imprimir tantos caracteres ‘*’
    // como indique el valor de cada elemento del array. Ejemplo: los valores 5,4,3,2 producirán la siguiente salida:
    //*****
    //****
    //***
    //**

    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 5;
        array[1] = 4;
        array[2] = 3;
        array[3] = 2;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


