package tema5;

import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número entero: ");
        numero = sc.nextInt();

        System.out.println("El número " + numero + " es capicúa: " );
        System.out.println(comprobarCapicua(numero));
    }
    public static boolean comprobarCapicua(int numero) {
        boolean resultado = true;
        String numeroString = String.valueOf(numero);
        int longitud = numeroString.length() - 1 ;

        for (int i = 0; i < numeroString.length() ; i++) {
            if (i == longitud) {
                break;
            }
            if(i<longitud){
                break;

            }
            if (numeroString.charAt(i) != numeroString.charAt(longitud)) {
                resultado = false;
                break;
            }
            longitud--;

        }
        return resultado;
    }
}
