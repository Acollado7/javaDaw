package tema5.Ejemplo;

import java.util.Random;

public enum Modelo {


    FORD_KUGA("ford", "Kuga", "60"),
    SEAT_PANDA("seat", "Panda", "48"),
    CUPRA("seat", "cupra", "95");
    String marca;
    String modelo;
    String cilindrada;

    private Modelo(String marca, String modelo, String cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return "Enum{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                '}';
    }

    public static Modelo getAleatorio(){
        Random rd = new Random();
        Modelo[] modelos = Modelo.values();
        int posicionValida = rd.nextInt(0,modelos.length);
        return modelos[posicionValida];
    }
}

