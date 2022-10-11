package tema3.EstructurasDeSeleccion;

import java.util.Random;

public class Ej02 {
    public static void main(String[] args) {

        //Utilizando el operador ternario ?: de Java, implementa las siguientes sentencias:
        //Si el número “x” es mayor o igual que 135 se devolverá “mayor”, si es menor se devolverá “menor”.
        // Las cadenas que se devuelven se guardarán en una variable llamada resultado.

        Random random = new Random();

        int x = random.nextInt(1000);

        String resultado = x >= 135 ? "mayor" : "menor";

        System.out.println("El numero es: " + x);

        System.out.println("El resultado es: " + resultado);

        //Si el número “x” es menor o igual que cero se imprimirá en pantalla “Menor que cero”, si no se imprimirá “Mayor que cero”.

        String resultado2 = x <= 0 ? "Menor que cero" : "Mayor que cero";

        System.out.println("El resultado es: " + resultado2);

        //Guardar el valor absoluto de un número entero en una variable entera (sin usar la función Math.abs())

        int valorAbsoluto = x < 0 ? x * -1 : x;

        System.out.println("El valor absoluto es: " + valorAbsoluto);








    }
}
