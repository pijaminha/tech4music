package br.com.tech4music.tech4music.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4music.Shared.MusicaDTO;
import br.com.tech4music.tech4music.Model.Musica;
import br.com.tech4music.tech4music.Service.MusicaService;

@RestController
@RequestMapping(value = "/api/musicas")
public class MusicaController {
    
    @Autowired
    private MusicaService servico;

    @GetMapping
        public ResponseEntity<List<Musica>> obterMusicas(){
            return new ResponseEntity<>(servico.obterMusicas(), HttpStatus.OK);
        }
        
    @GetMapping(value = "/{id}")
        public ResponseEntity<MusicaDTO> obterPorId(@PathVariable String id){
            Optional<MusicaDTO> mus = servico.obterPorId(id);

            if (mus.isPresent()){
                return new ResponseEntity<>(mus.get(), HttpStatus.OK);
            }else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    @PostMapping
        public ResponseEntity<MusicaDTO> adicionaMusica(@RequestBody Musica musica) {
            return new ResponseEntity<>(servico.adicionaMusica(musica), HttpStatus.CREATED);
        }

    @DeleteMapping(value = "/{id}")
        public ResponseEntity<Void> removerMusica(@PathVariable String id){
            Optional<MusicaDTO> mus = servico.obterPorId(id);

            if (mus.isPresent()) {
                servico.removerMusica(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    @PutMapping(value = "/{id}")
        public ResponseEntity<Musica> atualizarMusica(@PathVariable String id, @RequestBody Musica newMusica){
            return new ResponseEntity<>(servico.atualizarMusica(id, newMusica), HttpStatus.OK);
        }

    }
