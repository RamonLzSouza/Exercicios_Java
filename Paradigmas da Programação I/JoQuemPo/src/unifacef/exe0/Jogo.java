/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifacef.exe0;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramon
 */
public class Jogo {
  
    public static void main(String[] args) {
        String opcaoUsuario = JOptionPane.showInputDialog("Escolha " + "\n 1. Papel \n 2. Pedra \n 3. Tesoura");
        Mao usuario;
        switch(opcaoUsuario){
            case "1": usuario = new Papel(); break;
            case "2": usuario = new Pedra(); break;
            case "3": usuario = new Tesoura(); break;
            default: usuario = new Papel();
        }
        //escolha do PC
        Random random = new Random();
        int opcaoPc = random.nextInt(3); //gera 0,1 ou 2
        Mao pc;
        switch(opcaoPc){
            case 0: pc = new Papel(); break;
            case 1: pc = new Pedra(); break;
            case 2: pc = new Tesoura(); break;
            default: pc = new Papel();
        }
        // POLIFORMISMO
        JOptionPane.showMessageDialog(null, usuario.compara(pc));
        
    }
    
}
