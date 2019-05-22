/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.ex01;

/**
 *
 * @author Ramon
 */
public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public Cliente(){}

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        char id = numeroConta.charAt(6);
        
        if ((id == '-') && (numeroConta.length() == 8)){
            System.out.println("Conta verificada");
            this.numeroConta = numeroConta;
        }else{
            System.out.println("Conta Incorreta");
        }
        
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        char id = numeroAgencia.charAt(4);
        
        if ((id == '-') && (numeroAgencia.length() == 6)){
            System.out.println("Agencia verificada");
            this.numeroAgencia = numeroAgencia;
        }else{
            System.out.println("Agencia Incorreta");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30){
        this.nome = nome;
        }
    }    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //metodos
    public void realizarDeposito(float x){
        this.saldo = this.saldo + x;
        
    }
    
    public void realizarSaque(float x){
        this.saldo = this.saldo - x;
    }
    
    public String imprimir(){
        return "Nro.Conta: " + this.numeroConta + "\n" + "Nro.Agencia: " + this.numeroAgencia + "\n" + "Nome: " + this.nome + "\n" + "Saldo: " + this.saldo + "\n";
        
    }
    
   
    
}
