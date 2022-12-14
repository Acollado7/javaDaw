package tema5.Ejemplo;

import java.util.Objects;

public class Empresa {
    private String nombre;
    private String cif;
    private CatalogoVehiculos catalogoVehiculos;
    private CatalogoClientes catalogoClientes;
    private CatalogoAlquiler catalogoAlquiler;

    public Empresa(String nombre, String cif, CatalogoVehiculos catalogoVehiculos, CatalogoClientes catalogoClientes, CatalogoAlquiler catalogoAlquiler) {
        this.nombre = nombre;
        this.cif = cif;
        this.catalogoVehiculos = catalogoVehiculos;
        this.catalogoClientes = catalogoClientes;
        this.catalogoAlquiler = catalogoAlquiler;
    }

    public Empresa(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public CatalogoVehiculos getCatalogoVehiculos() {
        return catalogoVehiculos;
    }

    public void setCatalogoVehiculos(CatalogoVehiculos catalogoVehiculos) {
        this.catalogoVehiculos = catalogoVehiculos;
    }

    public CatalogoClientes getCatalogoClientes() {
        return catalogoClientes;
    }

    public void setCatalogoClientes(CatalogoClientes catalogoClientes) {
        this.catalogoClientes = catalogoClientes;
    }

    public CatalogoAlquiler getCatalogoAlquiler() {
        return catalogoAlquiler;
    }

    public void setCatalogoAlquiler(CatalogoAlquiler catalogoAlquiler) {
        this.catalogoAlquiler = catalogoAlquiler;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", cif='" + cif + '\'' +
                ", catalogoVehiculos=" + catalogoVehiculos +
                ", catalogoClientes=" + catalogoClientes +
                ", catalogoAlquiler=" + catalogoAlquiler +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return nombre.equals(empresa.nombre) && cif.equals(empresa.cif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cif);
    }
}
