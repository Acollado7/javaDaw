package tema3.EstructurasDeSeleccion;

public class Ej08 {


        public static void main(String args[]){
            char departamento = 'B';

            switch(departamento)
            {
                case 'A' :
                    System.out.println("Desarrollo");
                    break;
                case 'B' :
                    System.out.println("Recursos Humanos");
                    break;
                case 'C' :
                    System.out.println("Finanzas");
                    break;
                case 'D' :
                    System.out.println("Mercadeo");
                default :
                    System.out.println("Departamento no válido");
            }
            System.out.println("Código para el departamento es " + departamento);
        }
    }
//dependiendo de la letra que introduzcas te da un departamento diferente

