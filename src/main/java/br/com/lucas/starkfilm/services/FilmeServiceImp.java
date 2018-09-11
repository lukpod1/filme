/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.starkfilm.services;

import br.com.lucas.starkfilm.model.Filme;
import br.com.lucas.starkfilm.repository.FilmeRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author lukas
 */
@Service
public class FilmeServiceImp implements FilmeService{

    private FilmeRepository filmeRepository;

    public FilmeServiceImp(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }
    
    @Override
    public void salvar(Filme filme) {
        this.filmeRepository.save(filme);
    }

    @Override
    public Filme buscar(Long id) {
        Optional<Filme> o = this.filmeRepository.findById(id);
        return o.get();
    }

    @Override
    public List<Filme> listar() {
        List<Filme> filmes = new ArrayList<>();

        Iterator<Filme> iterator = this.filmeRepository.findAll().iterator();

        while (iterator.hasNext()) {

            filmes.add(iterator.next());
        }

        return filmes;
    }

    @Override
    public void remover(Long id) {
        this.filmeRepository.deleteById(id);
    }
    
}
