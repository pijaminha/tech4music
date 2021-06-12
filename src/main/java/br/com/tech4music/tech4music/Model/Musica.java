package br.com.tech4music.tech4music.Model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("musicas")
public class Musica {
    @Id
    private String id;

    @NotBlank(message = "Nome da Musica não pode estar com caracteres em branco!")
    @NotEmpty(message = "Nome da Musica não pode ficar em branco!")
    private String titulo;

    @NotBlank(message = "Nome do Artista não pode estar com caracteres em branco!")
    @NotEmpty(message = "Nome do Artista não pode ficar em branco!")
    private String artista;

    @NotBlank(message = "Nome do Album não pode estar com caracteres em branco!")
    @NotEmpty(message = "Nome do Album não pode ficar em branco!")
    private String album;

    @NotBlank(message = "O genero da música não pode estar com caracteres em branco!")
    @NotEmpty(message = "O genero da música não pode ficar em branco!")
    private String genero;

    @Size(max = 4, message = "Quantidade máxima de caracteres para o ano de lançamento é 04!")
    @NotBlank(message = "O ano de lançamento da música não pode estar com caracteres em branco!")
    @NotEmpty(message = "O ano de lançamento da música não pode ficar em branco!")
    private String anoLancamento;

    @NotBlank(message = "Nome do Compositor não pode estar com caracteres em branco!")
    @NotEmpty(message = "Nome do Compositor não pode ficar em branco!")
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
