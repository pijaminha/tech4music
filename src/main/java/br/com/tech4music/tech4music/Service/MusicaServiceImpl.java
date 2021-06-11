package br.com.tech4music.tech4music.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.tech4music.Repository.MusicaRepository;
import br.com.tech4music.Shared.MusicaDTO;
import br.com.tech4music.tech4music.Model.Musica;

public class MusicaServiceImpl implements MusicaService{

    @Autowired
        private MusicaRepository repositorio;

    @Override
    public List<Musica> obterMusicas() {
        return repositorio.findAll();
    }

    @Override
    public Optional<MusicaDTO> obterPorId(String id) {
        Optional <Musica> mus = repositorio.findById(id);

        if (mus.isPresent()) {
            return Optional.of(new ModelMapper().map(mus.get(), MusicaDTO.class));
        }else
        return Optional.empty();
    }

    @Override
    public MusicaDTO adicionaMusica(Musica musica) {
        repositorio.save(musica);
        return new ModelMapper().map(musica, MusicaDTO.class);
    }

    @Override
    public void removerMusica(String id) {
        repositorio.deleteById(id);
    }

    @Override
    public Musica atualizarMusica(String id, Musica newMusica) {
        newMusica.setId(id);
        return repositorio.save(newMusica);
    }
    
}
