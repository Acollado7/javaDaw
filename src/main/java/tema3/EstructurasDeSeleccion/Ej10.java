package tema3.EstructurasDeSeleccion;

public class Ej10 {
    public static void main(String[] args) {
// modificar el codigo para que la variable 2 valga 30

        int variable=3, variable2;

        switch(variable)
        {

            case 1:
                variable2=5;
                break;
            case 2:
                variable2=20;
                break;
            case 3:
                variable2=30;
                break;
            case 4:
                variable2=10;
                break;
            default:
                variable2=100;
                break;

        }

        //¿Cuánto vale variable2 al finalizar la ejecución del switch?

        System.out.println("variable2 = " + variable2);

//la variable 2 vale 30

    }
}
