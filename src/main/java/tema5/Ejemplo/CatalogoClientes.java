package tema5.Ejemplo;

public class CatalogoClientes {
    //Hacer catalogo de clientes (nombre, nif,apellido)
    private int numerocliente;
    private Cliente[] clientes;
    //El constructor recibe el tamaño del catalogo e
    //inicializa la estructura de datos con Clientes aleatorios

    public CatalogoClientes(int tamanio){
        tamanio = Math.abs(tamanio);
        this.numerocliente = tamanio;
        this.clientes = new Cliente[tamanio];
        for (int i = 0; i < tamanio; i++) {
            this.clientes[i] = new Cliente();
        }
    }

    public void mostrarCatalogo(){
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public int getNumerocliente() {
        return numerocliente;
    }

    public String toString() {
        String resultado = "";
        for (Cliente cliente : clientes) {
            resultado += cliente.toString() + "\n";
        }
        return resultado;
    }

    public void borrarCliente(Cliente cliente){
        int posicion = buscarCliente(cliente);
        if(posicion >= 0){
            this.clientes[posicion] = null;
        }
    }

    public int buscarCliente(Cliente cliente){
        for (int i = 0; i<this.clientes.length; i++) {
            if(cliente.equals(this.clientes[i])){
                return i;
            }
        }
        return -1;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public String aniadirCliente(Cliente cliente){
        String resultado = "";
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] == null){
                clientes[i] = cliente;
                resultado = "Cliente añadido";
                break;
            }else{
                resultado = "No se ha podido añadir el cliente";
            }
        }
        return resultado;
    }


    public void insertarCliente(Cliente cliente1) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente1;
                break;
            }
        }
    }


}
