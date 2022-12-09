package tema5.Ejemplo;

import java.util.Random;

public enum Color {
    ROJO,NEGRO,AMARILLO,VERDE,AZUL,BLANCO;

    public static Color getAleatorio(){
        Random rd = new Random();
        Color[] colores = Color.values();
        int posicionValida = rd.nextInt(0,colores.length);
        return colores[posicionValida];
    }
}
