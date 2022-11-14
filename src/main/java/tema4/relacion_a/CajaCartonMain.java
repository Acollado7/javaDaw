package tema4.relacion_a;

public class CajaCartonMain {
    public static void main(String[] args) {

        String CajaGrande;
        String CajaPequeña;

        CajaCarton cajaGrande = new CajaCarton(100, 100, 100, 100);
        CajaCarton cajaPequeña = new CajaCarton(50, 50, 50, 50);
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



    }
}
