package br.com.tech4music.tech4music.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("musicas")
public class Musica {
    @Id
    private String id;
    private String titulo;
    private String artista;
    private String album;
    private String genero;
    private String anoLancamento;
    private String compositor;

    @Override
    public String toString() {
        return "Musica [album=" + album + ", anoLancamento=" + anoLancamento + ", artista=" + artista + ", compositor="
                + compositor + ", genero=" + genero + ", id=" + id + ", titulo=" + titulo + "]";
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    
}
