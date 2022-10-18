package tema3.EstructurasDeRepeticion;

public class Ej12 {
    //Modifica el programa del ejercicio 10 para que se vea el código numérico (número entero) de cada una de las letras.

    /*
    * public static void main (String [] args) {
        for (char i='a'; i<='z'; i++) {
            System.out.println(i);
        }
    }*/

    public static void main (String [] args) {
        for (char i='a'; i<='z'; i++) {
            System.out.println((int)i);
        }
    }
}
