/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.starkfilm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lukas
 */
@Controller
public class HelloWorld {
    
    @RequestMapping("/hello")
    public String Hello() {

        return "helloWorld";
    }
}
