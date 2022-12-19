package tema5;

public class Ej15 {
    public static void main(String[] args) {
        //Escribe una clase LanzarMoneda que tenga como único atributo un array de booleanos de tamaño 1000. La clase tendrá los siguientes métodos:
        //un método para rellenar el array, de forma que simule 1000 lanzamientos de una moneda.
        // El método debe almacenar el resultado de cada tirada en el array.
        //un método para saber cuántas “caras” salieron después de los lanzamientos.
        //un método para saber cuántas “cruces” salieron después de los lanzamientos.
        //un método para imprimir el resultado de los 1000 lanzamientos, de forma que aparezca el número de lanzamiento y el resultado (cara o cruz)

        LanzarMoneda lanzarMoneda = new LanzarMoneda();
        lanzarMoneda.rellenarArray();
        lanzarMoneda.imprimirArray();
        System.out.println("Caras: " + lanzarMoneda.contarCaras());
        System.out.println("Cruces: " + lanzarMoneda.contarCruces());

    }

    public static class LanzarMoneda {
        private boolean[] array = new boolean[1000];

        public void rellenarArray() {
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.random() < 0.5;
            }
        }

        public int contarCaras() {
            int contador = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i]) {
                    contador++;
                }
            }
            return contador;
        }

        public int contarCruces() {
            int contador = 0;
            for (int i = 0; i < array.length; i++) {
                if (!array[i]) {
                    contador++;
                }
            }
            return contador;
        }

        public void imprimirArray() {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Lanzamiento " + (i + 1) + ": " + (array[i] ? "Cara" : "Cruz"));
            }
        }
    }
}
