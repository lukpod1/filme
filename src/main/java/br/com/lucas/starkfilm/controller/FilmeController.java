/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.starkfilm.controller;

import br.com.lucas.starkfilm.model.Filme;
import br.com.lucas.starkfilm.services.FilmeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lukas
 */
@Controller
@RequestMapping("/filme")
public class FilmeController {
    
    private FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }
        
    @GetMapping("/listar")
    public String listar(Model model){
        
       model.addAttribute("filmes", filmeService.listar());
        
        return "/filme/listar";
    }
    
    @GetMapping("/{id}/editar")
    public String editar(@PathVariable("id") Long id, Model model){
        
        model.addAttribute("filme", filmeService.buscar(id));
        
        return "/filme/formulario";
    }
    
    @GetMapping("/{id}/excluir")
    public String excluir(@PathVariable("id") Long id){
        
        filmeService.remover(id);
        
        return "redirect:/filme/listar";
    }
    
    @GetMapping("/novo")
    public String novo(Model model){
        
        model.addAttribute("filme", new Filme());
        
        return "/filme/formulario";
    }
    
    @PostMapping("/salvar")
    public String salvar(Filme filme){
        
    
        filmeService.salvar(filme);
        
        return "redirect:/filme/listar";
    }
}
