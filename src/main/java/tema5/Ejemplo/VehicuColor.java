package tema5.Ejemplo;

import java.util.Random;

public enum VehicuColor {
    ROJO,NEGRO,AMARILLO,VERDE,AZUL,BLANCO;

    public static VehicuColor getAleatorio(){
        Random rd = new Random();
        VehicuColor[] colores = VehicuColor.values();
        int posicionValida = rd.nextInt(0,colores.length);
        return colores[posicionValida];
    }
}
