package ejerciciosclase;

import javax.swing.*;
import java.util.Scanner;

public class Ejc01 {
    public static void main(String[] args) {
     //leer por teclaso nombre y apellidos de una persona
        //edad, peso(kg) y estatura

        //Guardar variables booleanas al resultado de evaluar la siguientes expresiones

        //1. La persona esta comprendida entre 25 y 30 años (ambos incluidos).
        //2. El peso es mayor de 50 kg y menor de 100 kg.
        //3. La persona no mide 1.75
        //4. La estatura se encuentra entre 100 y 180 cm (ambos excluidos).
        //5. La edad es mas de 10 años y no supera los 60 años.
        //6. El nombre es igual a "pablo" ignorando mayusculas y minusculas.
        // Usar el equalsIgnoreCase de los String
        //El apellido contiene la letra "J" (usa contains de los String).
        //El apellido termina en "dez", usa endsWith de los String.
        //La edad no esta entre los 40 y 50 años.

        //empezamos con las variables
/*
        String nombre, apellidos;
        int edad;
        double peso, estatura;

        //leemos por teclado

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        nombre = teclado.nextLine();

        System.out.println("Introduce tus apellidos");
        apellidos = teclado.nextLine();

        System.out.println("Introduce tu edad");
        edad = teclado.nextInt();

        System.out.println("Introduce tu peso");
        peso = teclado.nextDouble();

        System.out.println("Introduce tu estatura");
        estatura = teclado.nextDouble();

        //ahora evaluamos las expresiones

        boolean expresion1 = edad >= 25 && edad <= 30;
        boolean expresion2 = peso > 50 && peso < 100;
        boolean expresion3 = estatura != 1.75;
        boolean expresion4 = estatura > 100 && estatura < 180;
        boolean expresion5 = edad > 10 && edad < 60;
        boolean expresion6 = nombre.equalsIgnoreCase("pablo");
        boolean expresion7 = apellidos.contains("J");
        boolean expresion8 = apellidos.endsWith("dez");
        boolean expresion9 = edad < 40 || edad > 50;

        //mostramos los resultados

        System.out.println("La persona esta comprendida entre 25 y 30 años (ambos incluidos): " + expresion1);
        System.out.println("El peso es mayor de 50 kg y menor de 100 kg: " + expresion2);
        System.out.println("La persona no mide 1.75: " + expresion3);
        System.out.println("La estatura se encuentra entre 100 y 180 cm (ambos excluidos): " + expresion4);
        System.out.println("La edad es mas de 10 años y no supera los 60 años: " + expresion5);
        System.out.println("El nombre es igual a \"pablo\" ignorando mayusculas y minusculas: " + expresion6);
        System.out.println("El apellido contiene la letra \"J\" (usa contains de los String): " + expresion7);
        System.out.println("El apellido termina en \"dez\", usa endsWith de los String: " + expresion8);
        System.out.println("La edad no esta entre los 40 y 50 años: " + expresion9);
*/
        //vamos a hacerlo con JOptionPane

        //leemos por teclado

        String nombre2 = JOptionPane.showInputDialog("Introduce tu nombre");
        String apellidos2 = JOptionPane.showInputDialog("Introduce tus apellidos");
        int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu peso"));
        double estatura2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu estatura"));

        //ahora evaluamos las expresiones

        boolean expresion12 = edad2 >= 25 && edad2 <= 30;
        boolean expresion22 = peso2 > 50 && peso2 < 100;
        boolean expresion32 = estatura2 != 1.75;
        boolean expresion42 = estatura2 > 100 && estatura2 < 180;
        boolean expresion52 = edad2 > 10 && edad2 < 60;
        boolean expresion62 = nombre2.equalsIgnoreCase("pablo");
        boolean expresion72 = apellidos2.contains("J");
        boolean expresion82 = apellidos2.endsWith("dez");
        boolean expresion92 = edad2 < 40 || edad2 > 50;

        //mostramos los resultados

        JOptionPane.showMessageDialog(null, "La persona esta comprendida entre 25 y 30 años (ambos incluidos): " + expresion12);
        JOptionPane.showMessageDialog(null, "El peso es mayor de 50 kg y menor de 100 kg: " + expresion22);
        JOptionPane.showMessageDialog(null, "La persona no mide 1.75: " + expresion32);
        JOptionPane.showMessageDialog(null, "La estatura se encuentra entre 100 y 180 cm (ambos excluidos): " + expresion42);
        JOptionPane.showMessageDialog(null, "La edad es mas de 10 años y no supera los 60 años: " + expresion52);
        JOptionPane.showMessageDialog(null, "El nombre es igual a \"pablo\" ignorando mayusculas y minusculas: " + expresion62);
        JOptionPane.showMessageDialog(null, "El apellido contiene la letra \"J\" (usa contains de los String): " + expresion72);
        JOptionPane.showMessageDialog(null, "El apellido termina en \"dez\", usa endsWith de los String: " + expresion82);
        JOptionPane.showMessageDialog(null, "La edad no esta entre los 40 y 50 años: " + expresion92);




    }
}

