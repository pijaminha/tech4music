package br.com.tech4music.tech4music.Service;

import java.util.List;
import java.util.Optional;

import br.com.tech4music.Shared.MusicaDTO;
import br.com.tech4music.tech4music.Model.Musica;

public interface MusicaService {
    
    List<MusicaDTO> obterMusicas();
    Optional<MusicaDTO> obterPorId(String id);
    MusicaDTO adicionaMusica(Musica musica);
    void removerMusica(String id);
    MusicaDTO atualizarMusica(String id, Musica newMusica);
}
