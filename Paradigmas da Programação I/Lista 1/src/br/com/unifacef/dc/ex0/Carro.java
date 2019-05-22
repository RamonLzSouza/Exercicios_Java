/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.dc.ex0;

/**
 *
 * @author Faculdade
 */
public class Carro {
    private float vel;
    private boolean status;
    //metodo construtor
    public Carro(float vel, boolean status){
        this.vel = vel;
        this.status = status;
    }
    public void ligar(){
        this.status = true;
    }
    public void desligar(){
        this.status = false;
    }
    public void acelerar(float x){
        this.vel = this.vel + x;
    }
    public void frear(float x){
        this.vel = this.vel - x;
    }
    public String toString(){
        return "Vel: " + this.vel + "Status: " + this.status;
    }
} // fecha classe
