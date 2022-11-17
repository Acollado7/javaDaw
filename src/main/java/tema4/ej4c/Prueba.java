package tema4.ej4c;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p1=new Persona();
        Persona p2=ServicioPersona.solicitarDatosP();
        boolean edad;
        float imc=0;

        System.out.println(p1);
        System.out.println("");
        System.out.println(p2);

        System.out.println("¿Es "+p1.getNombre()+" mayor de edad?");
        edad=p1.mayorEdad();
        System.out.println(edad);

        System.out.println("¿Es "+p2.getNombre()+" mayor de edad?");
        edad=p2.mayorEdad();
        System.out.println(edad);

        imc=p1.calcularIMC();
        System.out.println("El imc de "+p1.getNombre()+" es "+imc);
        ClasificacionImc(imc);

        imc=p2.calcularIMC();
        System.out.println("El imc de "+p2.getNombre()+" es "+imc);
        ClasificacionImc(imc);

        Serie s1=new Serie("The Walking Dead","Terror","Un grupo de personas sobreviven a un apocalipsis zombie",5,"AMC");
        System.out.println(s1);

        Serie s2=new Serie("The Big Bang Theory","Comedia","Un grupo de amigos que viven en Pasadena",8,"CBS");
        System.out.println(s2);

        p1.darLike(s1);

        System.out.println(s1);
        System.out.println(s2);

        p2.darLike(s2);


    }
    private static void ClasificacionImc(float imc){

        //Calculamos el IMC de la persona para ver si esta por debajo de su peso ideal, en su peso ideal o por encima de su peso ideal.

        if(imc<20){
            System.out.println("La persona esta por debajo de su peso ideal");
        }else if(imc>=20 && imc<=25){
            System.out.println("La persona esta en su peso ideal");
        }else{
            System.out.println("La persona esta por encima de su peso ideal");
        }


    }


    }

