package tema5.Ejemplo;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private String apellido;
    private String nif;

    private static int contador = 0;

    public Cliente(String nombre, String apellido, String nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        contador++;
        this.nif = String.valueOf(contador);
    }
    public Cliente() {
        this.nombre = RandomStringUtils.randomAlphabetic(10);
        this.apellido = RandomStringUtils.randomAlphabetic(10);
        contador++;
        this.nif = String.valueOf(contador);

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

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Cliente.contador = contador;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nif, cliente.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif);
    }
}
