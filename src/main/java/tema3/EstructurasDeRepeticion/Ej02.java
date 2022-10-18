package tema3.EstructurasDeRepeticion;

import java.util.Scanner;

public class Ej02 {
    // bucle que te pide que insertes un numero y te da todos los numeros hasta el que has insertado
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        while (x<=n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }

}
