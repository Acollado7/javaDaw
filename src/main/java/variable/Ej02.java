package variable;

public class Ej02 {
    public static void main(String[] args) {
        //Declaramos e inicializamos tres variables int en la misma instrucción (a=1, b=2, c=3)

        int a = 1, b = 2, c = 3;

        //Declaramos e inicializamos tres variables double en la misma instrucción (d=4.5, e=5.7, f=6.9).

        double d = 4.5, e = 5.7, f = 6.9;

        //Mostramos las variables en dos líneas, la primera línea
        // mostrará las variables tipo entero y la segunda línea mostrará las variables tipo double.

        System.out.println("Variables tipo int    a = " + a + " b = " + b + " c = " + c);
        System.out.println("Variables tipo doble    d = " + d + " e = " + e + " f = " + f);

        //Realizaremos los siguiente intercambios de valores:
        // en b guarda c, en c guarda a, en a guarda b. Muestra por pantalla el resultado.

        int aux = b;
        b = c;
        c = a;
        a = aux;
        System.out.printf("Intercambio de valores: a = %d, b = %d, c = %d %n", a, b, c);

    }
}
