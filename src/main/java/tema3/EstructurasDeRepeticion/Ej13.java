package tema3.EstructurasDeRepeticion;

public class Ej13 {
    //Modifica el programa del ejercicio 11 para que se vea el código numérico (número entero) de cada una de las letras.
    /*public static void main (String [] args) {
        char i='A';
        do {
            System.out.println(i);
            i++;
        } while (i<='Z');
    }*/

    public static void main (String [] args) {
        char i='A';
        do {
            System.out.println((int)i);
            i++;
        } while (i<='Z');
    }
}
