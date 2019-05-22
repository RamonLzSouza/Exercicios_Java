/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.exe2;

/**
 *
 * @author Ramon
 */
public class Passageiro {
    private String nome;
    private String cpf;
    
    public Passageiro(){
    }

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\n Passageiro{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
    
    
}
