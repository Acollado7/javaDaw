package tema4.relacion_a;

public class MisSeries {
    public static void main(String[] args) {

        Serie Simpsons = new Serie("Los Simpsons", "Comedia", "Una familia de clase media que vive en un barrio de clase media", 30, "20th Century Fox");
        Serie BreakingBad = new Serie("Breaking Bad", "Drama", "Un profesor de química que se dedica a fabricar metanfetaminas", 5, "AMC");
        Serie GameOfThrones = new Serie("Game of Thrones", "Accion", "Una serie de fantasía épica", 8, "HBO");

        System.out.println(Simpsons.toString());

        System.out.println("----------------------");

        System.out.println(BreakingBad.toString());

        System.out.println("----------------------");

        System.out.println(GameOfThrones.toString());

        }


    }

