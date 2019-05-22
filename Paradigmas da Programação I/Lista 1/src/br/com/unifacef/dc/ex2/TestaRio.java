/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.dc.ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author Faculdade
 */
public class TestaRio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        Rio obj = new Rio ("Rio Grande", 9, true);
        obj.chover(50);
        obj.ensolarar(15);
        obj.limpar();
        JOptionPane.showMessageDialog(null,obj.mostrar());
        
        Rio obj1 = new Rio ("Rio Tiete", 45, false);
        obj1.chover(25);
        obj1.ensolarar(10);
        obj1.sujar();
        JOptionPane.showMessageDialog(null,obj1.mostrar());
    }
    
}
