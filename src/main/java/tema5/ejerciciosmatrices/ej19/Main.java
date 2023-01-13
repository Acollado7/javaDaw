package tema5.ejerciciosmatrices.ej19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int altura;
        int anchura;
        int alturaTronco;
        int anchuraTronco;
        int alturaArbol;
        int anchuraArbol;
        int numLineas = 0;
        int numAsteriscos = 0;
        int numEspacios = 0;
        int numEspaciosTronco = 0;
        int numAsteriscosTronco = 0;

        System.out.println("Introduce la altura de las Hojas: ");
        altura = sc.nextInt();
        System.out.println("Introduce la anchura de las Hojas: ");
        anchura = sc.nextInt();
        System.out.println("Introduce la altura del tronco: ");
        alturaTronco = sc.nextInt();
        System.out.println("Introduce la anchura del tronco: ");
        anchuraTronco = sc.nextInt();

        alturaArbol = altura + alturaTronco;
        anchuraArbol = anchura;

        char[][] arbol = new char[alturaArbol][anchuraArbol];

        //rellenamos el arbol de espacios
        for (int i = 0; i < alturaArbol; i++) {
            for (int j = 0; j < anchuraArbol; j++) {
                arbol[i][j] = ' ';
            }
        }

        //rellenamos las hojas
        for (int i = 0; i < altura; i++) {
            numLineas++;
            numAsteriscos = numLineas * 2 - 1;
            numEspacios = (anchura - numAsteriscos) / 2;
            for (int j = 0; j < anchura; j++) {
                if (j >= numEspacios && j < anchura - numEspacios) {
                    arbol[i][j] = '*';
                }
            }
        }

        //rellenamos el tronco
        for (int i = altura; i < alturaArbol; i++) {
            numEspaciosTronco = (anchura - anchuraTronco) / 2;
            numAsteriscosTronco = anchuraTronco;
            for (int j = 0; j < anchura; j++) {
                if (j >= numEspaciosTronco && j < anchura - numEspaciosTronco) {
                    arbol[i][j] = '*';
                }
            }

    }
        //mostramos el arbol
        for (int i = 0; i < alturaArbol; i++) {
            for (int j = 0; j < anchuraArbol; j++) {
                System.out.print(arbol[i][j]);
            }
            System.out.println();
        }



}
}
