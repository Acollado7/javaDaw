package tema5.cancion;

import java.util.Objects;

public class Cancion {
    private String titulo;
    private String artista;
    private String album;
    private int duracionCancion;
    private int reproducciones;

    public Cancion(String titulo, String artista, String album, int duracion, int reproducciones) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracionCancion = duracion;
        this.reproducciones = reproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuracionCancion() {
        return duracionCancion;
    }

    public void setDuracionCancion(int duracionCancion) {
        this.duracionCancion = duracionCancion;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", duracion=" + duracionCancion +
                ", reproducciones=" + reproducciones +
                '}';
    }
    //implementamos equals y hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Objects.equals(titulo, cancion.titulo) && Objects.equals(artista, cancion.artista) && Objects.equals(album, cancion.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista, album);
    }
}

