package tema4.ej4c;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServicioPersona {
    //Clase ServicioPersona, que tiene un método para solicitar los
    // datos de una persona por teclado y crear un objeto Persona, usando el constructor parametrizado.

    public static Persona solicitarDatosP(){
        Scanner sc = new Scanner(System.in);

        Persona persona;
        String nombre;
        int edad;
        char sexo;
        String sexoString;
        double peso;
        int altura;

        nombre = pedirString("Introduce el nombre: ");

        System.out.println("Introduce la edad: ");
        edad = filtrarNumeroEnteroScaner();

        System.out.println("Introduce el sexo: ");
        sexoString = sc.nextLine();
        sexoString = sexoString.toUpperCase();
        sexo = sexoString.charAt(0);

        System.out.println("Introduce el peso: ");
        peso = filtrarNumeroDecimalScanner();

        System.out.println("Introduce la altura: ");
        altura = filtrarNumeroEnteroScaner();

        persona = new Persona();

        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setSexo(sexo);
        persona.setPeso(peso);
        persona.setAltura(altura);

        return persona;
    }


    private static int filtrarNumeroEnteroScaner() {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        boolean seguir = true;
        do {

            try {
                numero = entrada.nextInt();
                seguir = false;
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor incorrecto, repita");
            }

            entrada.nextLine();
        } while (seguir);

        return numero;
    }
    public static String pedirString(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String string = "";
        System.out.println(mensaje);
        string = sc.nextLine();
        return string;
    }

    public static double filtrarNumeroDecimalScanner() {

        Scanner entrada = new Scanner(System.in);

        double numero = 0;
        boolean seguir = true;
        do {

            try {
                numero = entrada.nextDouble();
                seguir = false;
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor incorrecto, repita");
            }

            entrada.nextLine();
        } while (seguir);

        return numero;

    }

}
