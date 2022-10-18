package tema3.EstructurasDeRepeticion;

public class Ej05 {
    //implementar el siguiente ejercicio usando do while
    /*
    * public class EstructuraRepetitivaWhile2 {
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
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 100);
    }
}
