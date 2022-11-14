package tema4.relacion_a;

public class CajaCarton {

    private double ancho;
    private double alto;
    private double largo;
    private double peso;

    public CajaCarton(double ancho, double alto, double largo, double peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "CajaCarton{" +
                "ancho=" + ancho + " mm" + "\n" +
                " alto=" + alto + " mm" + "\n" +
                " largo=" + largo + " mm" + "\n" +
                " peso=" + peso + " gr" +
                '}';
    }

    public void abrir() {
        System.out.println("Abriendo caja");
    }

    public void cerrar() {
        System.out.println("Caja cerrada");
    }
}
