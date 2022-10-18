package tema3.EstructurasDeRepeticion;

public class Ej06 {
    ////implementar el siguiente ejercicio usando for
    /*public class EstructuraRepetitivaWhile2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        while (x<=n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }
*/

    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            System.out.println(n);
        }
    }
}
