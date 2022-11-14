package utilities;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class UtilidadesExamen {


    public class utilidades {

        /*
        En esta clase vamos a crear una clase metodos para poder utilizarla en cualquier parte del programa
        1.-Metodo que controle excepciones en Scanner
        2.-Metodo que controle excepciones en JOptionPane
        3.-Metodo que controle Scanner con rangos
        4.-Metodo que controle JOptionPane con rangos
        5.-Metodo que saque un numero random entre 2 numeros
        6.-Metodo que

         */
        public static int filtrarNumeroEscaner(){

            Scanner entrada=new Scanner(System.in);

            int numero=0;
            boolean seguir=true;
            do {

                System.out.println("Introduce el número");

                try {
                    numero=entrada.nextInt();
                    seguir=false;
                } catch (InputMismatchException ime) {
                    System.out.println("Ha introducido un valor incorrecto, repita");
                }

                entrada.nextLine();
            } while (seguir);

            return numero;
        }

        public static int filtrarNumeroJOptionPane(){

            int numero=0;
            boolean seguir=true;
            do {


                try {
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
                    seguir=false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Ha introducido un valor incorrecto, repita");
                }

            } while (seguir);

            return numero;
        }

        public static int filtrarNumeroEscanerRango(int minimo, int maximo){

            Scanner entrada=new Scanner(System.in);

            int numero=0;
            boolean seguir=true;
            do {

                System.out.println("Introduce el número");

                try {
                    numero=entrada.nextInt();
                    if(numero>=minimo && numero<=maximo){
                        seguir=false;
                    }else{
                        System.out.println("El número debe estar entre " + minimo + " y " + maximo);
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Ha introducido un valor incorrecto, repita");
                }

                entrada.nextLine();
            } while (seguir);

            return numero;
        }

        public static int filtrarNumeroJOptionPaneRango(int minimo, int maximo) {

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

        public static int numeroRandom(int minimo, int maximo){

            Random random=new Random();
            int numero=random.nextInt(maximo-minimo+1)+minimo;
            return numero;
        }




    }

}
