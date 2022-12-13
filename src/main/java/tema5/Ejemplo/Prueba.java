package tema5.Ejemplo;

public class Prueba {
    public static void main(String[] args) {

        CatalogoClientes catalogoClientes = new CatalogoClientes(3);
        Cliente cliente1 = new Cliente("Pepe", "Perez");
        Cliente cliente2 = new Cliente("Juan", "Gomez");
        Cliente cliente3 = new Cliente("Maria", "Garcia");
        //Añadimos los tres clientes
        catalogoClientes.getClientes()[0] = cliente1;
        catalogoClientes.getClientes()[1] = cliente2;
        catalogoClientes.getClientes()[2] = cliente3;

        //Mostramos el catalogo
        System.out.println(catalogoClientes);

        //Borramos un cliente
        catalogoClientes.borrarCliente(cliente2);

        //Mostramos el catalogo
        System.out.println(catalogoClientes);




    }
}
