package tema3.EstructurasDeRepeticion;

public class Ej03 {
    // Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 - 120, etc. No se introducen valores por teclado.

    public static void main(String[] args) {
        int numero = 15;
        for (int i = 0; i < 25; i++) {
            System.out.println(numero);
            numero *= 2;
        }
    }
}
