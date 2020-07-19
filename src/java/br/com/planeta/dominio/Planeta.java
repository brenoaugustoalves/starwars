/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.planeta.dominio;

/**
 *
 * @author Breno
 */

public class Planeta {
    private String nome;
    private String clime;
    private String terreno; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClime() {
        return clime;
    }

    public void setClime(String clime) {
        this.clime = clime;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }
}
