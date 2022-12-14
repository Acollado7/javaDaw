package tema5.Ejemplo;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Objects;

public class Vehiculo {
    private String bastidor;
    private String matricula;
    private Modelo modelo;
    private Color color;
    private boolean disponible;
    private double tarifa;
    private static int contador = 0;

    public Vehiculo() {
        this.bastidor = RandomStringUtils.randomAlphanumeric(10);
        this.matricula = RandomStringUtils.randomNumeric(4) + "   "+ RandomStringUtils.randomAlphabetic(3).toUpperCase();
        this.modelo = Modelo.getAleatorio();
        this.color = Color.getAleatorio();

    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    //generamos hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(bastidor, vehiculo.bastidor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bastidor);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "bastidor='" + bastidor + '\'' +
                ", matricula='" + matricula + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                ", disponible=" + disponible +
                ", tarifa=" + tarifa +
                '}';
    }


}
