package tema4.relacion_a;

import java.util.Random;

public class CajaCartonMain {
    public static void main(String[] args) {

        String CajaGrande;
        String CajaPequeña;

        CajaCarton cajaGrande = new CajaCarton(250, 400, 500, 200);
        CajaCarton cajaPequeña = new CajaCarton(25, 30, 15, 17);

        System.out.println("------------------------------------------------------------");
        System.out.println("Caja Grande");
        System.out.println(cajaGrande.toString());

        System.out.println("------------------------------------------------------------");
        System.out.println("Caja Pequeña");
        System.out.println(cajaPequeña.toString());

        System.out.println("------------------------------------------------------------");
        cajaGrande.abrir();

        System.out.println("------------------------------------------------------------");
        System.out.println("Caja Grande");
        System.out.println(cajaGrande.toString());

        System.out.println("------------------------------------------------------------");
        cajaGrande.cerrar();

        System.out.println("------------------------------------------------------------");
        cajaPequeña.abrir();

        System.out.println("------------------------------------------------------------");
        System.out.println("Caja Pequeña");
        System.out.println(cajaPequeña.toString());

        System.out.println("------------------------------------------------------------");
        cajaPequeña.cerrar();

        System.out.println("------------------------------------------------------------");
/*
        System.out.println("Mostramos usando los getters");

        System.out.println("------------------------------------------------------------");

        System.out.println("Caja Grande");

        System.out.println("Ancho: " + cajaGrande.getAncho() + " mm");

        System.out.println("Alto: " + cajaGrande.getAlto() + " mm");

        System.out.println("Largo: " + cajaGrande.getLargo() + " mm");

        System.out.println("Peso: " + cajaGrande.getPeso() + " gr");

        System.out.println("------------------------------------------------------------");

        System.out.println("Caja Pequeña");

        System.out.println("Ancho: " + cajaPequeña.getAncho() + " mm");

        System.out.println("Alto: " + cajaPequeña.getAlto() + " mm");

        System.out.println("Largo: " + cajaPequeña.getLargo() + " mm");

        System.out.println("Peso: " + cajaPequeña.getPeso() + " gr");

        System.out.println("------------------------------------------------------------");
        */
        /*
        System.out.println("Mostramos usando los setters");

        System.out.println("------------------------------------------------------------");

        System.out.println("Caja Grande");

        cajaGrande.setAncho(300);

        cajaGrande.setAlto(450);

        cajaGrande.setLargo(550);

        cajaGrande.setPeso(250);

        System.out.println("Ancho: " + cajaGrande.getAncho() + " mm");

        System.out.println("Alto: " + cajaGrande.getAlto() + " mm");

        System.out.println("Largo: " + cajaGrande.getLargo() + " mm");

        System.out.println("Peso: " + cajaGrande.getPeso() + " gr");

        System.out.println("------------------------------------------------------------");

        System.out.println("Caja Pequeña");

        cajaPequeña.setAncho(30);

        cajaPequeña.setAlto(35);

        cajaPequeña.setLargo(20);

        cajaPequeña.setPeso(20);

        System.out.println("Ancho: " + cajaPequeña.getAncho() + " mm");

        System.out.println("Alto: " + cajaPequeña.getAlto() + " mm");

        System.out.println("Largo: " + cajaPequeña.getLargo() + " mm");

        System.out.println("Peso: " + cajaPequeña.getPeso() + " gr");

        System.out.println("------------------------------------------------------------");
        */

        




    }
}
