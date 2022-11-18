package tema4.ejprueba;

public class Cuenta {
    //Atributos: nºCuenta(20 digitos), NIF cliente, Nombre cliente, saldo actual, interes% (entre 0.1 y 0.3 )

    //metodos: Constructor por defecto nºCuenta aleatorio, Constructor Parametrizado nºCuenta aleatorio,
    //Getter y Setter (no hay set para nºcuenta), toString


    private String numeroCuenta;

    private String NIF;

    private String nombreCliente;

    private double saldoActual;

    private double interes;

    public Cuenta() {
        this.numeroCuenta = generarNumeroCuenta();
        this.NIF = "";
        this.nombreCliente = "";
        this.saldoActual = 0;
        this.interes = 0;
    }



    public Cuenta(String NIF, String nombreCliente, double saldoActual, double interes) {
        this.numeroCuenta = generarNumeroCuenta();
        this.NIF = NIF;
        this.nombreCliente = nombreCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNIF(){
        return this.NIF;
    }

    public void setNIF(String NIF){
        this.NIF = NIF;
    }

    public String getNombreCliente(){
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public double getSaldoActual(){
        return this.saldoActual;
    }

    public void setSaldoActual(double saldoActual){
        this.saldoActual = saldoActual;
    }

    public double getInteres(){
        return this.interes;
    }

    public void setInteres(double interes){
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", NIF='" + NIF + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", saldoActual=" + saldoActual +
                ", interes=" + interes +
                '}';
    }

    private String generarNumeroCuenta() {
        //El numero de cuenta debe ser de 20 digitos
        String numeroCuenta = "";

        for (int i = 0; i < 20; i++) {
            numeroCuenta += (int) (Math.random() * 10);
        }

        return numeroCuenta;
    }

}
