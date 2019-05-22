/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.exe1;

import javax.swing.JOptionPane;



/**
 *
 * @author Ramon
 */
public class TestaPassageiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mala m1 = new Mala(1, 23, "Branca");
        Mala m2 = new Mala(2,12, "Marrom");
        Mala m3 = new Mala(3,5, "Verde");
        
        Passageiro pa1 = new Passageiro("Ramon", "12345");
        
        //C - Create
        pa1.adicionaMala(m1);
        pa1.adicionaMala(m2);
        pa1.adicionaMala(m3);
        JOptionPane.showMessageDialog(null, pa1.toString());
        
        //D - delete
        pa1.removeMala(m2);
        JOptionPane.showMessageDialog(null, pa1.toString());
        
        //U - update
        Mala m4 = new Mala(3, 9, "Verde escura");
        pa1.atualizaMala(m4);
        JOptionPane.showMessageDialog(null, pa1.toString());
    }
    
}
