package tema5.ordenacionbusqueda;

import java.util.Objects;

public class Pais implements Comparable<Pais>{
    private String nombre;
    private long poblacion;
    private long superficie;
    private String moneda;

    public Pais (String nombre, long poblacion, long superficie, String moneda) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.moneda = moneda;
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public long getSuperficie() {
        return superficie;
    }

    public void setSuperficie(long superficie) {
        this.superficie = superficie;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", superficie=" + superficie +
                ", moneda='" + moneda + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return nombre.equals(pais.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

}
