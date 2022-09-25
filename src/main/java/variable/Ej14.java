package variable;

public class Ej14 {
    public static void main(String[] args) {
        // El programa tendrá una variable entera tiempo inicializada con un valor leído por teclado,
        // en segundos, y queremos conocer este tiempo pero expresado en horas, minutos y segundos, mostrando los resultados por pantalla.

        // Variables y conversor a segundos
        int tiempo = 3600;
        int horas = tiempo / 3600;
        int minutos = (tiempo % 3600) / 60;
        int segundos = (tiempo % 3600) % 60;

        // Mostrar por pantalla
        System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos");


    }
}
