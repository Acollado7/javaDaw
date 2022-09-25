package operadoresrelacionales;

public class Ej04 {
    public static void main(String[] args) {

        //La aplicación Java contendrá comentarios descriptivos del código y realizará lo siguiente:

       //Declaramos e inicializamos dos variables int (a=10,  b=20).

        int a = 10, b = 20;

        // Declaramos cuatro variables booleanas

        boolean c, d, e, f;

        //Guardamos, en las variables booleanas, el resultado de realizar las siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.

        c = a < b;
        d = a > b;
        e = a == b;
        f = a != b;

        //Mostramos en pantalla el resultado de las operaciones, usando las variables booleanas.

        System.out.println("a < b = " + c);
        System.out.println("a > b = " + d);
        System.out.println("a == b = " + e);
        System.out.println("a != b = " + f);


    }
}
