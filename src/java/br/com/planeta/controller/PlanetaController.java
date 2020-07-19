/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.planeta.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Breno
 */

@Controller
public class PlanetaController {
    
    @RequestMapping("/teste")
    public String inicio() {
            return "index";
    }
    
    
    @RequestMapping("/buscar-nome")
    public String buscarnome() {
        return "buscarnome";    
    }
    
    
    @RequestMapping("/buscarid")
    public String buscarnumero() {
        return "buscarid";
    }
    
    @RequestMapping("/remover")
    public String remover() {
        return "remover";
    }
    @RequestMapping("/listar")
    public String listar() {
        return "listar";
    }
}
