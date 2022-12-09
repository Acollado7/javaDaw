package tema5.Ejemplo;

public class CatalogoVehiculos {

    private int numeroVehiculos;
    private Vehiculo[] listaVehiculos;

    //El constructor recibe el tamaño del catalogo e
    //inicializa la estructura de datos con vehiculos aleatorios
    public CatalogoVehiculos(int tamanio){
        tamanio = Math.abs(tamanio);
        this.numeroVehiculos = tamanio;
        this.listaVehiculos = new Vehiculo[tamanio];
        for (int i = 0; i < tamanio; i++) {
            this.listaVehiculos[i] = new Vehiculo();
        }

    }
    public void mostrarCatalogo(){
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo);
        }
    }
    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public void borrarVehiculo(Vehiculo vehiculo){
        int posicion = buscarVehiculo(vehiculo);
        if(posicion >= 0){
            this.listaVehiculos[posicion] = null;
        }
    }

    public int buscarVehiculo(Vehiculo vehiculo){
        for (int i = 0; i<this.listaVehiculos.length; i++) {
            if(vehiculo.equals(this.listaVehiculos[i])){
                return i;
            }
        }
        return -1;
    }


    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }
}
