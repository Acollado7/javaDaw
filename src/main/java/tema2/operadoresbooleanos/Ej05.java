package tema2.operadoresbooleanos;

public class Ej05 {
    public static void main(String[] args) {
        //La aplicación Java contendrá comentarios descriptivos del código y realizará lo siguiente

        //Declara e inicializa dos variables lógicas, una se llamará verdadero y valdrá true, la otra falso y valdrá false

        boolean verdadero = true, falso = false;

        //Mostramos las tablas de verdad de las operaciones lógicas && (AND) y || (OR), usando las variables verdadero y
        // falso. Usa text blocks y la instrucción println() para mostrar los resultados de evaluar las siguientes expresiones lógicas

        //verdadero && verdadero
        //verdadero && falso
        //falso && verdadero
        //falso && falso
        //verdadero || verdadero
        //verdadero || falso
        //falso || verdadero
        //falso || falso

        System.out.println("""
                verdadero && verdadero = %b
                verdadero && falso = %b
                falso && verdadero = %b
                falso && falso = %b
                verdadero || verdadero = %b
                verdadero || falso = %b
                falso || verdadero = %b
                falso || falso = %b
                """.formatted(
                verdadero && verdadero,
                verdadero && falso,
                falso && verdadero,
                falso && falso,
                verdadero || verdadero,
                verdadero || falso,
                falso || verdadero,
                falso || falso
        ));

        //Mostramos en pantalla el resultado de las expresiones !verdadero y !falso

        System.out.println( " !verdadero = " + !verdadero);
        System.out.println( " !falso = " + !falso);



    }
}
