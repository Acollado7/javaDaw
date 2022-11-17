package tema4.ej4c;

import org.apache.commons.lang3.RandomStringUtils;

public class Persona {
    private String nombre;
    private int edad;
    private String NIF;
    private char sexo;
    private double peso;
    private int altura;

    public Persona(){
        this.nombre = "Alberto";
        this.edad = 21;
        this.NIF = "77016132B";
        this.sexo = 'H';
        this.peso = 90.0;
        this.altura = 180;
    }

    //Constructor con parámetros

    public Persona(String nombre, int edad, String NIF, char sexo, double peso, int altura){
        this.nombre = nombre;
        this.edad = edad;
        this.NIF = generaNIF();
        if (filtrarSexo(sexo)) {

            this.sexo = sexo;

        }else {
            this.sexo = 'O';
        }
        this.peso = peso;
        this.altura = altura;
    }

    //Constructor copia

    public Persona(Persona persona){
        this.nombre = persona.nombre;
        this.edad = persona.edad;
        this.NIF = persona.NIF;
        this.sexo = persona.sexo;
        this.peso = persona.peso;
        this.altura = persona.altura;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNIF(){
        return this.NIF;
    }

    public char getSexo(){
        return this.sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }





    public boolean filtrarSexo(char sexo){
        boolean resultado = true;

        if(sexo == 'H' || sexo == 'M') {
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }


    public String generaNIF(){
        String nif = "";
        String letra = "";
        int numero;
        int resto;

        nif = RandomStringUtils.randomNumeric(8);
        numero = Integer.parseInt(nif);
        resto = numero %23;

        switch(resto){
            case 0:
                letra = "T";
                break;
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;
        }
        nif = numero + letra;
        return nif;
    }

    public boolean mayorEdad(){
        boolean resultado = true;

        if(this.edad >= 18){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }

    public void darLike(Serie s){

        s.setLikes(s.getLikes()+1);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", NIF='" + NIF + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public float calcularIMC() {
        float imc = 0;
        imc=(float)(this.peso/Math.pow((double)this.altura/100, 2));
        return imc;
    }
}
