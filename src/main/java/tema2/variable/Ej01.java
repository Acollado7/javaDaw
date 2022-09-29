package tema2.variable;

public class Ej01 {
    public static void main( String[] args ) {
        // Incializamos una tema2.variable primitiva de cada tipo
        int entero ;
        short corto ;
        byte byte1 ;
        long largo;
        float flotante ;
        double doble;
        char caracter;
        boolean booleano;

        //Declaramos una constante numerica de tipo double y otra de tipo int
        //a la hora de poner el nombre usamos el modificador final
        final double PI;
        final int NUMERO ;

        //Declaramos un objeto String
        String cadena ;

        //Inicializamos las variables, las contantes y el objeto literales con los valores que yo quiera
        entero = 10;
        corto = 20;
        byte1 = 30;
        largo = 40L;
        flotante = 50.5373827f;
        doble = 60.73643534;
        caracter = 'b';
        booleano = false;
        cadena = "Hola";
        PI = 3.1416;
        NUMERO = 100;

        //Mostramos en pantalla cada una de las variables,
        // constantes y objetos anteriores, en distintas líneas, usando println().

        System.out.println("El valor de entero es: " + entero);
        System.out.println("El valor de corto es: " + corto);
        System.out.println("El valor de byte1 es: " + byte1);
        System.out.println("El valor de largo es: " + largo);
        System.out.println("El valor de flotante es: " + flotante);
        System.out.println("El valor de doble es: " + doble);
        System.out.println("El valor de caracter es: " + caracter);
        System.out.println("El valor de booleano es: " + booleano);
        System.out.println("El valor de cadena es: " + cadena);
        System.out.println("El valor de PI es: " + PI);
        System.out.println("El valor de NUMERO es: " + NUMERO);

        //Utilizamos printf(), para limitar a dos dígitos la salida de variables de tipo float y double.

        System.out.printf("El valor de flotante es: %.2f %n", flotante);
        System.out.printf("El valor de doble es: %.2f %n", doble);

    }
}
