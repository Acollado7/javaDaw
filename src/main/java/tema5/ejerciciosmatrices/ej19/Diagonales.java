package tema5.ejerciciosmatrices.ej19;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diagonales {
    public static void main(String[] args) {
        int[][] matriz = {
                {4,5,9,5},
                {7,5,1,6},
                {9,4,6,1},
                {2,4,3,7}
        };

        List <Casilla> listaCasillas = casillasVecinas (2,2,matriz);

        for (Casilla casilla : listaCasillas)
            System.out.println(casilla);

        mostrarMatriz(matriz);
        List<Integer> diagonal = elementosDiagonalPrincipal(matriz);
        diagonal.forEach(System.out::println);

        System.out.println(Arrays.toString(elementosDiagonalSecundaria(matriz)));


    }

    public static List<Casilla> casillasVecinas(int fila, int columna, int[][] matriz){
        List<Casilla> lista = new ArrayList<>();
        //Comprobamos fila y columna para que sean validas
        if (esFilaValida(fila, matriz) && esColumnaValida(columna, matriz)){
            //Recorremos la fila anterior a la casilla hasta la fila posterior
            for (int i = fila -1; i <= fila+1; i++){
                if (esFilaValida(i, matriz)){ //Si alguna fila no es valida. no la mira
                    //Recorremos la columna anterior a la casilla hasta la columna posterior
                    for (int j =columna-1; j <=columna+1; j++) {
                        //Si la columna
                        if (esColumnaValida(j, matriz)){
                            if (i == fila && j == columna) {
                                continue;
                            }
                            System.out.println("Casilla " + i + " " + j);
                            lista.add(new Casilla(i,j,matriz[i][j]));
                        }

                }
                }
            }

        }

        return lista;
    }

    public static boolean esFilaValida(int fila, int[][] matriz){
        return fila >= 0 && fila <matriz.length;

    }

    public static boolean esColumnaValida(int columna, int[][] matriz){
        return columna >= 0 && columna <matriz.length;

    }

    public static int[] elementosDiagonalSecundaria(int[][] m){
        int[] array = new int[m.length];

        for (int i=0; i<m.length; i++){
           array[i] = m[i][m.length-1-i];
        }

        return array;
    }

    public static List<Integer> elementosDiagonalPrincipal (int [][] m){
        List<Integer> lista = new ArrayList<>();
            for (int i=0; i<m.length; i++){
                lista.add(m[i][i]);
            }

        return lista;
    }

    public static void mostrarMatriz (int[][] m){
        for (int[] fila : m ){ //Por cada fila de la matriz m
            for (int valor : fila) { // Por cada elemento que hay en la fila
                System.out.print(valor + " ");
            }
            System.out.println(" ");
        }
    }


}
