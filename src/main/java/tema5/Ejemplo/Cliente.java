package tema5.Ejemplo;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private String apellido;
    private String nif;

    public Cliente() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = RandomStringUtils.randomNumeric(8) + "   "+ RandomStringUtils.randomAlphabetic(1).toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido, cliente.apellido) && Objects.equals(nif, cliente.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, nif);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }
}
