package tema3.EstructurasDeRepeticion;

public class Ej04 {
    // bucle que te da los numeros del 1 al 10 hacia delante y hacia atras
    public static void main(String[] args) {
        int numero = 1;

        while (numero < 11)
        {
            System.out.println("Número: " + numero);
            numero++;
        }
        do {
            System.out.println("Número: " + --numero);
        } while(numero > 1);
    }

}
