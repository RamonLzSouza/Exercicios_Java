package br.com.unifacef.exe0;

import java.util.Date;
import javax.swing.JOptionPane;

public class Testa {
    public static void main(String[] args) {
       
        Conta conta = new Conta("123-4", "567-8", "Ramon", 2000);
        
        Cartao cartao = new Cartao(123, 1234, 6666, "VISA", new Date(), conta);
        JOptionPane.showMessageDialog(null, cartao.toString());
        
        if (!cartao.saque(800, 123)){
            JOptionPane.showMessageDialog(null, "Saque não realizado");
        }
        else JOptionPane.showMessageDialog(null, cartao.toString());

    }
   
}
