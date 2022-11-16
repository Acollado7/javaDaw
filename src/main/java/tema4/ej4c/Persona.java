package tema4.ej4c;

public class Persona {

    //Creamos el metodo boolean filtrarSexo(char sexo), si el
    // dato que se pasa como parámetro no es “H” ni “M” ni "O" el valor
    // de retorno es falso. En caso de que devuelva falso, el sexo será ‘O’.

    public char filtrarSexo(char sexo){
        if(sexo == 'H' || sexo == 'M'){
            return sexo;
        }else{
            return 'O';
        }
    }

    //Creamos el metodo String generaNIF(). Devuelve un String con un NIF
    // válido. Se debe generar un número aleatorio de 8 dígitos y a partir de
    // éste, generar la letra correspondiente. La letra del NIF se obtiene del
    // resto de la división entera del número de DNI entre 23 y se usa la siguiente
    // correspondencia para obtener la letra que corresponde:
    //0 – T,  1 – R,  2 – W,  3 – A,  4 – G, 5 – M,  6 – Y,  7 – F,  8 – P,  9 – D,
    // 10 – X, 11 – B,  12 – N, 13 – J,  14 – Z,  15 – S, 16 – Q
    //17 – V,  18 – H,  19 – L,  20 – C,  21 – K, 22 – E


    public String generaNIF(){
        String nif = "";
        int numero = (int) (Math.random() * 100000000);
        int resto = numero % 23;
        String letra = "";
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


    //Clase Persona con los siguiente atributos encapsulados:
    //Nombre, edad, NIF, sexo (‘H’  - hombre - ’M’ - mujer - ’O’ - otros -), peso y altura
    //El NIF es un String de 9 elementos que contiene 8 números y una letra.

    private String nombre;
    private int edad;
    private String NIF;
    private char sexo;
    private double peso;
    private double altura;

    //Constructor por defecto

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.NIF = "";
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    //Constructor con parámetros

    public Persona(String nombre, int edad, String NIF, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.NIF = generaNIF();
        this.sexo = filtrarSexo(sexo);
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

    //Métodos getters y setters

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

    public void setNIF(String NIF){
        this.NIF = NIF;
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

    public void setAltura(double altura){
        this.altura = altura;
    }

    //Método toString


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
}
