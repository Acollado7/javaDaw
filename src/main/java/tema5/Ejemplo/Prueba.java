package tema5.Ejemplo;

public class Prueba {
    public static void main(String[] args) {

       CatalogoVehiculos catalogo = new CatalogoVehiculos(10);
        System.out.println("El Nº de vehiculos es: " + catalogo.getNumeroVehiculos());
        System.out.println("El catalogo es: " + catalogo);

        //Usamos el metodo copiarVehiculo

        Vehiculo[] copia = catalogo.copiarVehiculo();
        System.out.println("El catalogo copiado es: " + copia);


    }
}
