package tema3.EstructurasDeRepeticion;

public class Ej11 {
    // Implementa un programa Java que permita visualizar todas las letras mayúsculas, desde la 'A' hasta la 'Z', usando un do – while.

    public static void main (String [] args) {
        char i='A';
        do {
            System.out.println(i);
            i++;
        } while (i<='Z');
    }
}
