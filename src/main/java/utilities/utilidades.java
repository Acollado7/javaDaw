package utilities;

public class utilidades {

    //metodo leer cadena

    public static String leerCadena() {
        return new java.util.Scanner(System.in).nextLine();
    }

    //metodo para leer numeros enteros sin errores

    public static int leerEntero() {
        int numero = 0;
        boolean error = true;
        do {
            try {
                numero = Integer.parseInt(leerCadena());
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("Error, no es un numero entero");
            }
        } while (error);
        return numero;
    }

    //metodo para leer numeros enteros en un rango

    public static int leerEntero(int min, int max) {
        int numero = 0;
        boolean error = true;
        do {
            try {
                numero = Integer.parseInt(leerCadena());
                if (numero < min || numero > max) {
                    System.out.println("Error, el numero debe estar entre " + min + " y " + max);
                } else {
                    error = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error, no es un numero entero");
            }
        } while (error);
        return numero;
    }


    //metodo comprobarEnteroRango

    public static boolean comprobarEnteroRango(int numero, int min, int max) {
        return numero >= min && numero <= max;
    }

    //metodo generar aleatorio Rango

    public static int generarAleatorioRango(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

}
