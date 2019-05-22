/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.dc.ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author Faculdade
 */
public class TestaProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto obj = new Produto(1,"produto qualquer",10,(float)9.00);
        obj.comprar(100);
        obj.vender(30);
        obj.subir(7);
        obj.descer(75);
        JOptionPane.showMessageDialog(null,obj.mostrar());
    }
    
}
