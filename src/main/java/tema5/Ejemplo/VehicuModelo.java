package tema5.Ejemplo;

import java.util.Random;

public enum VehicuModelo {

    SEAT_PANDA("Seat", "Panda", "48"),
    FORD_KUGA("Ford", "Kuga", "120"),
    CUPRA("Seat", "Cupra", "140");
    String marca;
    String modelo;
    String cilindrada;

    private VehicuModelo(String marca, String modelo, String cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "VehiculoModelo{" + "marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + '}';
    }

    public static VehicuModelo modeloAleatorio() {

        VehicuModelo[] modelos = VehicuModelo.values();
        Random rd = new Random();
        int posicionValida = rd.nextInt(modelos.length);
        return modelos[posicionValida];

    }
}

