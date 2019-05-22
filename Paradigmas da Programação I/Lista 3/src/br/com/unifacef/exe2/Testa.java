/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.exe2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ramon
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rodoviaria r1 = new Rodoviaria("Rodô", "Franca");
        Onibus o1 = new Onibus(999, "Mercedes");
        r1.adicionaOnibus(o1);
        Onibus o2 = new Onibus(777, "Volvo");
        r1.adicionaOnibus(o2);
        
        Passageiro p1 = new Passageiro("Fulano", "123");
        Passageiro p2 = new Passageiro("Beltrano", "456");
        Passageiro p3 = new Passageiro("Cilclano", "789");
        Passageiro p4 = new Passageiro("João", "246");
        
        r1.adicionaOnibusPassageiro(o1, p1);
        r1.adicionaOnibusPassageiro(o1, p2);
        r1.adicionaOnibusPassageiro(o1, p3);
        r1.adicionaOnibusPassageiro(o1, p4);
        
        JOptionPane.showMessageDialog(null, r1.toString());
        
        r1.removeOnibusPassageiro(o2, p3);
        
        JOptionPane.showMessageDialog(null, r1.toString());
        
        Passageiro p5 = new Passageiro("Beltrano da Silva", "456");
        
        r1.atualizaOnibusPassageiro(o1, p5);
        
        JOptionPane.showMessageDialog(null, r1.toString());
        
        
        
    }
    
}
