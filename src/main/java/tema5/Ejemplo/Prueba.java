package tema5.Ejemplo;

public class Prueba {
    public static void main(String[] args) {

        CatalogoVehiculos catalogo = new CatalogoVehiculos(10);
        catalogo.mostrarCatalogo();
        Vehiculo[] array = catalogo.getListaVehiculos();
        array[0].setBastidor("123456");
        catalogo.mostrarCatalogo();

        Vehiculo v1 = new Vehiculo();
        v1.setBastidor("123456");
        System.out.println(v1);

        int posicion = catalogo.buscarVehiculo(v1);
        System.out.println("Posicion: " + posicion);

        catalogo.borrarVehiculo(v1);
        catalogo.mostrarCatalogo();
    }
}
