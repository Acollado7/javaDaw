package operadoresaritmeticos;

public class Ej03 {
    public static void main(String[] args) {
        //Declaramos e inicializamos tres variables int (a=10,  b=5, i=0)
        int a = 10, b = 5, i = 0;

        //Declaramos e inicializamos dos variables double (c=71.3 y d=4.8)
        double c = 71.3, d = 4.8;

        //Realizamos las siguientes operaciones aritméticas a+b, a-b, a*b, a/b, c+d, c-d, c*d, c/d.

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));

        //El resultado de cada operación se almacenara en una nuevas variables

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        double sumaDouble = c + d;
        double restaDouble = c - d;
        double multiplicacionDouble = c * d;
        double divisionDouble = c / d;

        //Muestra el resultado de cada operación usando text blocks, usando las variables que acabamos de crear

        System.out.println("""
                El resultado de la suma es: """ + suma + """ 
                El resultado de la resta es: """ + resta + """
                El resultado de la multiplicación es: """ + multiplicacion + """
                El resultado de la división es: """ + division + """
                El resultado de la suma double es: """ + sumaDouble + """
                El resultado de la resta double es: """ + restaDouble + """
                El resultado de la multiplicación double es: """ + multiplicacionDouble + """
                El resultado de la división double es: """ + divisionDouble + """
               
                """.formatted(suma , resta, multiplicacion, division, sumaDouble,
                restaDouble, multiplicacionDouble, divisionDouble));


        //También mostramos en pantalla los resultados de las siguientes operaciones: a*=3, b-=1, a/=b, c+=d.

        System.out.println("a *= 3 = " + (a *= 3));
        System.out.println("b -= 1 = " + (b -= 1));
        System.out.println("a /= b = " + (a /= b));
        System.out.println("c += d = " + (c += d));

        //Finalmente, el programa muestra en consola la
        // siguiente información, en distintas instrucciones:
        // valor de i, valor de i++, valor de i y valor de ++i.

        System.out.println("Valor de i: " + i);
        System.out.println("Valor de i++: " + i++);
        System.out.println("Valor de i: " + i);
        System.out.println("Valor de ++i: " + ++i);



    }
}
