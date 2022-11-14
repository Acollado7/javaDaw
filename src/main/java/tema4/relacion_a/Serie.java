package tema4.relacion_a;

public class Serie {
    //titulo, genero (Accion, comedia, SiFi, drama), sipnosis, temporadas, productora.
    //

    private String titulo;
    private String genero;
    private String sipnosis;
    private int temporadas;
    private String productora;

    public Serie(String titulo, String genero, String sipnosis, int temporadas, String productora) {
        this.titulo = titulo;
        this.genero = genero;
        this.sipnosis = sipnosis;
        this.temporadas = temporadas;
        this.productora = productora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\n' +
                " genero='" + genero + '\n' +
                " sipnosis='" + sipnosis + '\n' +
                " temporadas=" + temporadas + '\n' +
                " productora='" + productora  +
                '}';
    }




}
