package tema5.Ejemplo;

public class Prueba {
    public static void main(String[] args) {

        CatalogoClientes catalogoClientes = new CatalogoClientes(3);

        System.out.println("------------------------");
        catalogoClientes.mostrarCatalogo();
        System.out.println("------------------------");
        System.out.println("Borrando cliente");
        catalogoClientes.borrarCliente(catalogoClientes.getClientes()[1]);
        System.out.println("------------------------");
        catalogoClientes.mostrarCatalogo();
        System.out.println("------------------------");
        System.out.println("Añadiendo cliente");
        catalogoClientes.aniadirCliente(new Cliente("Pepe", "Perez", "12345678A"));
        System.out.println("------------------------");
        catalogoClientes.mostrarCatalogo();
        System.out.println("------------------------");
        System.out.println("Buscando cliente");
        System.out.println(catalogoClientes.buscarCliente(new Cliente("Pepe", "Perez", "12345678A")));
        System.out.println("------------------------");
        System.out.println("Buscando cliente");
        //buscamos al cliente 2
        System.out.println(catalogoClientes.buscarCliente(catalogoClientes.getClientes()[2]));





    }
}
