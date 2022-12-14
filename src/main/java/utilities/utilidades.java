package utilities;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class utilidades {

    public static int filtrarNumeroEnteroScaner() {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        boolean seguir = true;
        do {

            System.out.println("Introduce el número");

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

    public static int filtrarNumeroEnteroScanerRango(int minimo, int maximo) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        boolean seguir = true;
        do {

            System.out.println("Introduce el número");

            try {
                numero = entrada.nextInt();
                if (numero >= minimo && numero <= maximo) {
                    seguir = false;
                } else {
                    System.out.println("El número debe estar entre " + minimo + " y " + maximo);
                }
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor incorrecto, repita");
            }

            entrada.nextLine();
        } while (seguir);

        return numero;
    }

    public static int filtrarNumeroEnteroJOptionPane() {

        int numero = 0;
        boolean seguir = true;
        do {

            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
                seguir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }

        } while (seguir);

        return numero;
    }

    public static int filtrarNumeroEnteroJOptionPaneRango(int minimo, int maximo) {

        int numero = 0;
        boolean seguir = true;
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
                if (numero >= minimo && numero <= maximo) {
                    seguir = false;
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe estar entre " + minimo + " y " + maximo);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }
        } while (seguir);
        return numero;
    }




    public static double filtrarNumeroDecimalScanner() {

        Scanner entrada = new Scanner(System.in);

        double numero = 0;
        boolean seguir = true;
        do {

            System.out.println("Introduce el número");

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

    public static double filtrarNumeroDecimalSccanerRango(double minimo, double maximo) {

        Scanner entrada = new Scanner(System.in);

        double numero = 0;
        boolean seguir = true;
        do {

            System.out.println("Introduce el número");

            try {
                numero = entrada.nextDouble();
                if (numero >= minimo && numero <= maximo) {
                    seguir = false;
                } else {
                    System.out.println("El número debe estar entre " + minimo + " y " + maximo);
                }
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor incorrecto, repita");
            }

            entrada.nextLine();
        } while (seguir);

        return numero;
    }

    public static double filtrarNumeroDecimalJOptionPane() {

        double numero = 0;
        boolean seguir = true;
        do {

            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número"));
                seguir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }

        } while (seguir);

        return numero;
    }

    public static double filtrarNumeroDecimalJOptionPaneRango(double minimo, double maximo) {

        double numero = 0;
        boolean seguir = true;
        do {
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número"));
                if (numero >= minimo && numero <= maximo) {
                    seguir = false;
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe estar entre " + minimo + " y " + maximo);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }
        } while (seguir);
        return numero;
    }



    public static int numeroEnteroRandom(int minimo, int maximo) {

        Random random = new Random();
        int numero = random.nextInt(maximo - minimo + 1) + minimo;
        return numero;
    }

    public static double numeroDecimalRandom(double minimo, double maximo) {

        Random random = new Random();
        double numero = random.nextDouble(maximo - minimo + 1) + minimo;
        return numero;
    }



    public static String pedirString(String mensaje) {
        String string = JOptionPane.showInputDialog(mensaje);
        return string;
    }


    public static int leerEntero(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
}
