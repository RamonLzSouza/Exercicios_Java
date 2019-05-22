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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CLIENTE FULANO
        Cliente fulano = new Cliente("123456-7", "1234-5", "Fulano", 100);
        fulano.realizarDeposito(550);
        fulano.realizarSaque(50);
        System.out.println(fulano.imprimir());
        
        //CLIENTE BELTRANO
        Cliente beltrano = new Cliente("144001-7", "1453-2", "Beltrano", 100000);
        beltrano.realizarDeposito(835);
        beltrano.realizarSaque(10000);
        System.out.println(beltrano.imprimir());
    }
    
}
