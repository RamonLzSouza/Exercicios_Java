/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.dc.ex2;

/**
 *
 * @author Faculdade
 */
public class Rio {
    private String nome;
    private float nivel;
    private boolean poluido;
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    //metodo que aumenta o nivel atual do rio
    public void chover(float x){
        this.nivel = this.nivel + x;
    }
    //metodo que diminui o nivel atual do rio
    public void ensolarar(float x){
        this.nivel = this.nivel - x;
    }
    //metodo que limpa o rio
    public void limpar(){
        this.poluido = false;
    }
    //metodo que polui o rio
    public void sujar(){
        this.poluido = true;
    }
    //metodo que mostra todas as informações do rio
    public String mostrar(){
        return "Nome do Rio: " + this.nome + "\n" + "Nivel do rio: " + this.nivel + "\n" + "Rio poluido: " + this.poluido;
    }
}
