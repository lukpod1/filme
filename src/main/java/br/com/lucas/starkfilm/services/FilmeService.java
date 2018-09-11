/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.starkfilm.services;

import br.com.lucas.starkfilm.model.Filme;
import java.util.List;

/**
 *
 * @author lukas
 */
public interface FilmeService {
    public void salvar(Filme filme);
    public Filme buscar(Long id);
    public List<Filme> listar();
    public void remover(Long id);
}
