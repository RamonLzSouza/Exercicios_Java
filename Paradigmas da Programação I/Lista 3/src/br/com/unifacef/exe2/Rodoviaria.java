/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.exe2;

import java.util.ArrayList;

/**
 *
 * @author Ramon
 */
public class Rodoviaria {
    private String nome;
    private String cidade;
    private ArrayList<Onibus> frota;
    public Rodoviaria(){
        this.frota = new ArrayList();
    }

    public Rodoviaria(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.frota = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getFrota() {
        return frota;
    }

    public void setFrota(ArrayList<Onibus> frota) {
        this.frota = frota;
    }

    @Override
    public String toString() {
        return "Rodoviaria{" + "nome=" + nome + ", cidade=" + cidade + ", frota=" + frota + '}';
    }
    
    public void adicionaOnibus(Onibus onibus){
        this.frota.add(onibus);
    }
    
    //adiciona passageiro no onibus da rodoviaria
    public void adicionaOnibusPassageiro(Onibus onibus, Passageiro passageiro){
        int pos = this.buscaOnibus(onibus.getNumero());
        if(pos != -1)
            onibus.adicionaPassageiro(passageiro);
    }
    
    public boolean removeOnibus(Onibus onibus){
        return this.frota.remove(onibus);
    }
    //remove passageiro no onibus da rodoviaria
    
    public boolean removeOnibusPassageiro(Onibus onibus, Passageiro passageiro){
        int pos = this.buscaOnibus(onibus.getNumero());
        if(pos != -1)
            return onibus.removePassageiro(passageiro);
        else return false;
        
    }
    
    public int buscaOnibus(int numero){
         for(int i =0; i <this.frota.size();i++){
            if(this.frota.get(i).getNumero() == numero){
                return i;
            }
            
        }
        return -1;
    }
    
    public boolean atualizaOnibus(Onibus onibus){
        int pos = this.buscaOnibus(onibus.getNumero());
        if(pos != -1){
            this.frota.set(pos, onibus);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean atualizaOnibusPassageiro(Onibus onibus, Passageiro passageiro){
        int pos = this.buscaOnibus(onibus.getNumero());
        if(pos != -1){
            return onibus.atualizaPassageiro(passageiro);
        }
        else return false;
    }
    
}
