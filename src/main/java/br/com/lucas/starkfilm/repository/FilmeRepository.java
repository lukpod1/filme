/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.starkfilm.repository;

import br.com.lucas.starkfilm.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lukas
 */
@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{
    
}
