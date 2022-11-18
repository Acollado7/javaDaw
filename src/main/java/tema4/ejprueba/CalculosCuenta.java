package tema4.ejprueba;

import java.util.InputMismatchException;

public class CalculosCuenta {

    //Metodos: IngresarIntereses (Cuenta cuenta), Aumenta el saldo de la cuenta (saldo = saldo + saldo*interes)
    //IngresarDinero (Cuenta cuenta, double cantidad), Aumenta el saldo de la cuenta (saldo = saldo + cantidad)
    //RetirarDinero (Cuenta cuenta, double cantidad), Disminuye el saldo de la cuenta (saldo = saldo - cantidad)
    //hay que controlar que no se pueda retirar mas dinero del que hay en la cuenta

    public static void ingresarIntereses(Cuenta cuenta){
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cuenta.getSaldoActual()*cuenta.getInteres());
    }

    public static void ingresarDinero(Cuenta cuenta, double cantidad){
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
    }

    public static void retirarDinero(Cuenta cuenta, double cantidad){


           if (cantidad > cuenta.getSaldoActual()){
               System.out.println("No se puede retirar mas dinero del que hay en la cuenta");
               System.out.println("Introduce una cantidad menor");
           } else {
               cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
           }

       }


        }







