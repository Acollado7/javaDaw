package tema4;

import org.apache.commons.lang3.RandomStringUtils;


public class Ej4B {


    //Vamos a realizar una aplicación para generar contraseñas y números pin.
    // La aplicación tendrá tres opciones: la primera, genera números pin aleatorios
    // para tarjetas SIM de teléfonos móviles; la segunda opción genera contraseñas para
    // usuarios de un sistema operativo con 8 caracteres, incluyendo números y letras;
    // la tercera opción, genera una secuencia de "n" caracteres aleatorios de un conjunto
    // que tú elijas (debes pasar un array de char de 10 elementos). El número "n" se debe solicitar por teclado.
    //Se deben crear, al menos, tres métodos de clase para generar las secuencias de cada opción.
    public static void main(String[] args) {
        System.out.println("Bienvenido al generador de contraseñas y números pin");
        System.out.println("-------------------------------------------------");
        System.out.println("1. Generar números pin aleatorios");
        System.out.println("2. Generar contraseñas para usuarios");
        System.out.println("3. Generar una secuencia de caracteres aleatorios");
        System.out.println("4. Salir");

        int opcion = utilities.utilidades.leerEntero(1, 4);



            switch (opcion) {
                case 1:
                    System.out.println("Generar números pin aleatorios");
                    System.out.println("-------------------------------------------------");
                    // Creamos el pin con 4 numeros

                    pin();

                    break;
                case 2:
                    System.out.println("Generar contraseñas para usuarios");
                    System.out.println("-------------------------------------------------");
                    // Creamos una contraseña con numeros y letras

                   password();

                    break;

                case 3:
                    System.out.println("Generar una secuencia de caracteres predefinidos");
                    System.out.println("-------------------------------------------------");

                    char[] conjuntoCaracteres = {'a', 'z', 'f', '@', '&', '*', '1', '2', '3', '4', '5'};

                    //pedimos el numero de caracteres que queremos que tenga la contraseña

                   password2();

                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
            }



    }
    public static void pin(){
        // Creamos el pin con 4 numeros

        String pin = RandomStringUtils.randomNumeric(4);
        System.out.println(pin);
    }

    public static void password(){
        // Creamos una contraseña con numeros y letras

        String password = RandomStringUtils.randomAlphanumeric(8);
        System.out.println(password);
    }

    public static void password2(){
        char[] conjuntoCaracteres = {'a', 'z', 'f', '@', '&', '*', '1', '2', '3', '4', '5'};

        //pedimos el numero de caracteres que queremos que tenga la contraseña

        int numero = utilities.utilidades.leerEntero(1, 10);
        String password2 = RandomStringUtils.random(numero, conjuntoCaracteres);
        System.out.println(password2);
    }
}
