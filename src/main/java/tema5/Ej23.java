package tema5;

public class Ej23 {
    public static void main(String[] args) {
        //Se desea manejar dos listas (ArrayList) de Integer. La cantidad de elementos de la lista 1 debe ser un
        // número aleatorio entre 5 y 15. La cantidad de elementos de la lista 2 debe ser un número aleatorio entre 10 y 20.
        // El rango de los números que serán agregados a la lista DEBE estar entre 50 y 100. Se pide construir una aplicación
        // en Java que permita cumplir con la siguiente funcionalidad:
        //Imprimir las listas que han sido generadas. Usa for-each.
        //Crear una tercera lista que contenga los elementos que están en la lista 1 y NO ESTÁN en la lista 2
        //Imprimir la tercera lista.
        //Crear una cuarta lista que contenga los elementos de la lista 1 que son pares y los elementos de la lista 2 que son impares
        //Imprimir la cuarta lista. Usa una expresión lambda.

        Lista lista1 = new Lista();
        Lista lista2 = new Lista();
        Lista lista3 = new Lista();

        lista1.imprimirLista();
        lista2.imprimirLista();





    }

    public static class Lista {
        private int[] lista;

        public Lista() {
            lista = new int[(int) (Math.random() * 11 + 5)];
            for (int i = 0; i < lista.length; i++) {
                lista[i] = (int) (Math.random() * 51 + 50);
            }
        }

        public void imprimirLista() {
            for (int i : lista) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


}
