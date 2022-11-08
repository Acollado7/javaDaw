package utilities;
import org.apache.commons.lang3.RandomStringUtils;


public class main {
    public static void main(String[] args) {

       //generamos e imprimimos 10 diferentes
        System.out.println("-----------------");
        // Creamos una contraseña con numeros y letras
        for (int i = 0; i < 10; i++) {
            String password = RandomStringUtils.randomAlphanumeric(8);
            System.out.println(password);
        }
        System.out.println("-------------------------------------------------");
        // Creamos el pin con 4 numeros
        for (int i = 0; i < 10; i++) {
            String pin = RandomStringUtils.randomNumeric(4);
            System.out.println(pin);
        }
        System.out.println("-------------------------------------------------");
        // Creamos un codigo con los caracteres que nosotros hemos introducido en el char
        // y que el usuario podra usar
        char[] conjuntoCaracteres = {'a','z','f','@','&','*','1','2','3','4','5'};
        int numero = 6;
        for (int i = 0; i < 10; i++) {
            String password2 = RandomStringUtils.random(i, conjuntoCaracteres);
            System.out.println(password2);
        }
        System.out.println("-------------------------------------------------");
        System.out.println(RandomStringUtils.randomNumeric(15).toUpperCase());
    }
}
